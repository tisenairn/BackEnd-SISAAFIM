package br.gov.rn.saogoncalo.smtsis.controllers;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.saogoncalo.smtsis.models.Benfeitorias;
import br.gov.rn.saogoncalo.smtsis.services.BenfeitoriasService;

@RestController
@RequestMapping("/benfeitoria")
public class BenfeitoriasController {

	@Autowired
	private BenfeitoriasService service;

    @GetMapping("benfeitorias")
    public ResponseEntity<List<Benfeitorias>> buscarTodos(){
        List<Benfeitorias> listaBenfeitorias = service.BuscarTodos();
        if (listaBenfeitorias.size() > 0){
            return ResponseEntity.ok(listaBenfeitorias);
        }
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("benfeitoria/{id}")
    public ResponseEntity<Benfeitorias> buscarPorID(@PathVariable Long id){
    	Benfeitorias benfeitoria = service.BuscarPorId(id);
        if (Optional.ofNullable(benfeitoria).isPresent())
            return ResponseEntity.ok(benfeitoria);
        return ResponseEntity.notFound().build();
    }
	
    @PostMapping("benfeitoria")
    public ResponseEntity<Benfeitorias> salvar(@RequestBody @Valid Benfeitorias benfeitoria, HttpServletResponse servletResponse) {
        if (benfeitoria != null ){
        	Benfeitorias benfeitoriaSalvo = service.salvar(benfeitoria);
            return ResponseEntity.status(HttpStatus.CREATED).body(benfeitoriaSalvo);
        }
        return ResponseEntity.noContent().build();
    }


    @DeleteMapping("benfeitoria/{id}")
    public ResponseEntity<Benfeitorias> deleta(@PathVariable Long id){
        if (service.deleta(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.badRequest().build();
    }
    
    @PutMapping("benfeitoria")
    public ResponseEntity<Benfeitorias> editar(@RequestBody Benfeitorias benfeitoria){
        if (Optional.ofNullable(service.editar(benfeitoria)).isPresent())
            return ResponseEntity.accepted().body(benfeitoria);
        return ResponseEntity.noContent().build();
    }
    
}
