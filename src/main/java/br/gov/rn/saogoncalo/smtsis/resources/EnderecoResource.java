package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.eventos.RecursoCriadoEvento;
import br.gov.rn.saogoncalo.smtsis.models.Endereco;
import br.gov.rn.saogoncalo.smtsis.services.EnderecoService;
import br.gov.rn.saogoncalo.smtsis.services.LocalizacaoEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("v1")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private LocalizacaoEnderecoService localizacaoEnderecoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("enderecos")
    public ResponseEntity<List<Endereco>> buscarTodos(){
        List<Endereco> listaEnderecos = enderecoService.buscarTodos();
        if (listaEnderecos.size() > 0){
            return ResponseEntity.ok(listaEnderecos);
        }
        return ResponseEntity.noContent().build();
    }

    @RequestMapping("endereco/{id}")
    public ResponseEntity<Endereco> buscarPorID(@PathVariable Long id){
        Endereco endereco = enderecoService.buscarPorId(id);
        if (Optional.ofNullable(endereco).isPresent())
            return ResponseEntity.ok(endereco);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("endereco")
    public ResponseEntity<Endereco> salvar(@RequestBody @Valid Endereco endereco
                                            ,HttpServletResponse servletResponse) {
        if (endereco != null ){
            Endereco enderecoSalvo = enderecoService.salvar(endereco);
            publisher.publishEvent(new RecursoCriadoEvento(this,
                                                                servletResponse,
                                                                enderecoSalvo.getId()));
            return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("endereco")
    public ResponseEntity<Endereco> atualizar(@RequestBody Endereco endereco){
        if (Optional.ofNullable(enderecoService.atualizar(endereco)).isPresent())
            return ResponseEntity.accepted().body(endereco);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("endereco/{id}")
    public ResponseEntity<Endereco> deleta(@PathVariable Long id){
        if (enderecoService.deleta(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.badRequest().build();
    }

}
