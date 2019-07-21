package br.gov.rn.saogoncalo.smtsis.resources;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.saogoncalo.smtsis.events.RecursoCriadoEvento;
import br.gov.rn.saogoncalo.smtsis.models.EnderecoContribuinte;
import br.gov.rn.saogoncalo.smtsis.services.contribuinte.EnderecoContribuinteService;

@CrossOrigin
@RestController
@RequestMapping("v1")
public class EnderecoContribuinteResource {

    @Autowired
    private EnderecoContribuinteService enderecoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("enderecos")
    public ResponseEntity<List<EnderecoContribuinte>> buscarTodos(){
        List<EnderecoContribuinte> listaEnderecoImovels = enderecoService.buscarTodos();
        if (listaEnderecoImovels.size() > 0){
            return ResponseEntity.ok(listaEnderecoImovels);
        }
        return ResponseEntity.noContent().build();
    }

    @RequestMapping("endereco/{id}")
    public ResponseEntity<EnderecoContribuinte> buscarPorID(@PathVariable Long id){
    	EnderecoContribuinte endereco = enderecoService.buscarPorId(id);
        if (Optional.ofNullable(endereco).isPresent())
            return ResponseEntity.ok(endereco);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("endereco")
    public ResponseEntity<EnderecoContribuinte> salvar(@RequestBody @Valid EnderecoContribuinte endereco
                                            ,HttpServletResponse servletResponse) {
        if (endereco != null ){
        	EnderecoContribuinte enderecoSalvo = enderecoService.salvar(endereco);
            publisher.publishEvent(new RecursoCriadoEvento(this,
                                                                servletResponse,
                                                                enderecoSalvo.getId()));
            return ResponseEntity.status(HttpStatus.CREATED).body(enderecoSalvo);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("endereco")
    public ResponseEntity<EnderecoContribuinte> atualizar(@RequestBody EnderecoContribuinte endereco){
        if (Optional.ofNullable(enderecoService.atualizar(endereco)).isPresent())
            return ResponseEntity.accepted().body(endereco);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("endereco/{id}")
    public ResponseEntity<EnderecoContribuinte> deleta(@PathVariable Long id){
        if (enderecoService.deleta(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.badRequest().build();
    }

}
