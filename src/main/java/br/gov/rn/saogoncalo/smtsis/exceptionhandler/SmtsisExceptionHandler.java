package br.gov.rn.saogoncalo.smtsis.exceptionhandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class SmtsisExceptionHandler extends ResponseEntityExceptionHandler {

//    Obter as resposta dos resources, em messages.properties
    @Autowired
    private MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        String respostaUsuario = messageSource.getMessage("resposta.invalida", null, LocaleContextHolder.getLocale());
        String respostaDesenvolvedor = ex.getCause().toString();
        List<Erro> erros = Arrays.asList(new Erro(respostaUsuario, respostaDesenvolvedor));

        return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);

    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<Erro> erros = criarListaDeErros(ex.getBindingResult());

        return handleExceptionInternal(ex, erros, headers, HttpStatus.BAD_REQUEST, request);
    }


    //  Métodos para erros
    private List<Erro> criarListaDeErros(BindingResult bindingResult){
        List<Erro> erros = new ArrayList<>();

        for (FieldError fieldError : bindingResult.getFieldErrors()){
            String respostaUsuario = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
            String respostaDesenvolvedor = fieldError.toString();
            erros.add(new Erro(respostaUsuario, respostaDesenvolvedor));
        }
        return erros;
    }

    public static class Erro {
        private String respostaUsuario;
        private String  respostaDesenvolvedor;

        public Erro(String respostaUsuario, String respostaDesenvolvedor) {
            this.respostaUsuario = respostaUsuario;
            this.respostaDesenvolvedor = respostaDesenvolvedor;
        }

        public String getMensagemUsuario() {
            return respostaUsuario;
        }

        public String getMensagemDesenvolvedor() {
            return respostaDesenvolvedor;
        }
    }

}
