package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.events.RecursoCriadoEvento;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.services.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

public abstract class GenericResourceController<T extends AuditedEntity> {

    @Autowired
    private GenericService<T> service;

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/listar")
    public ResponseEntity<List<T>> buscarTodos(){
        return service.buscarTodos().size() > 0 ?
                ResponseEntity.ok().body(service.buscarTodos()) : ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<T> buscarPeloId(@PathVariable Long id){
        AuditedEntity auditedEntity = service.buscarAtivoPeloId(id);
        return service.buscarAtivoPeloId(id) != null ?
                ResponseEntity.ok().body(service.buscarAtivoPeloId(id)) : ResponseEntity.notFound().build();
    }

    @GetMapping("/listar/inativos")
    public ResponseEntity<List<T>> buscarTodosInativos(){
        return service.buscarTodosInativos().size() > 0 ?
                ResponseEntity.ok().body(service.buscarTodosInativos()) : ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/inativo/{id}")
    public ResponseEntity<T> buscarInativoPeloId(@PathVariable Long id){
        return service.buscarInativoPeloId(id) != null ?
                ResponseEntity.ok().body(service.buscarInativoPeloId(id)) : ResponseEntity.notFound().build();
    }

    @PostMapping("/salvar")
    public ResponseEntity<T> salvar(@Valid @RequestBody T entity, HttpServletResponse resposta){

//        TODO Fazer validações para retornar erro e não salvar duplicatas de acordo com matrícula
        T entityResponse = service.salvar(entity);
        applicationEventPublisher.publishEvent(new RecursoCriadoEvento(this, resposta, entityResponse.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(entityResponse);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<T> atualizar(@Valid @PathVariable Long id,
                                             @RequestBody T entity, HttpServletResponse resposta){
        T entityResponse = service.atualizar(id, entity);

//            Se a resposta do método atualizar for diferente de nulo, ele vai obter o local, e o objeto criado;
        return entityResponse != null ?
                ResponseEntity.ok().body(entityResponse) : ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/remover/{id}")
    public ResponseEntity<T> remover(@PathVariable Long id,
                                           HttpServletResponse resposta){

        Boolean entityResponse = service.removerPeloId(id);
        return entityResponse == false ? ResponseEntity.notFound().build() : ResponseEntity.ok().build();
    }
}
