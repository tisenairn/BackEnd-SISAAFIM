package br.gov.rn.saogoncalo.smtsis.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.saogoncalo.smtsis.models.LocalizacaoEnderecoContribuinte;
import br.gov.rn.saogoncalo.smtsis.services.contribuinte.LocalizacaoEnderecoContribuinteService;

@CrossOrigin
@RestController
@RequestMapping("v1")
public class LocalizacaoEnderecoContribuinteResource {

    @Autowired
    private LocalizacaoEnderecoContribuinteService localizacaoEnderecoService;

    @GetMapping("localizacaoEndereco")
    public ResponseEntity<List<LocalizacaoEnderecoContribuinte>> buscarTodos(){
        List<LocalizacaoEnderecoContribuinte> localizacaoEnderecos =
                localizacaoEnderecoService.buscarTodos();
        if (localizacaoEnderecos != null)
            return ResponseEntity.ok().body(localizacaoEnderecos);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEnderecoContribuinte> salvar(@RequestBody@Valid LocalizacaoEnderecoContribuinte localizacaoEndereco
                                                        ,@PathVariable Long enderecoId){
    	LocalizacaoEnderecoContribuinte locEndSalvar = localizacaoEnderecoService.salvar(localizacaoEndereco, enderecoId);
        if (locEndSalvar != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(locEndSalvar);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

    @GetMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEnderecoContribuinte> buscarPorId(@PathVariable Long id){
    	LocalizacaoEnderecoContribuinte localEndEncotrada = localizacaoEnderecoService.buscarPorId(id);
        if (localEndEncotrada != null)
            return ResponseEntity.ok(localEndEncotrada);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEnderecoContribuinte> deletePorId(@PathVariable Long id){
        if (localizacaoEnderecoService.deletePorId(id))
            return ResponseEntity.ok().build();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEnderecoContribuinte> atualizar(@PathVariable Long enderecoId,
                                                         @RequestBody LocalizacaoEnderecoContribuinte locaEndereco){
    	LocalizacaoEnderecoContribuinte locEndAtualizado = localizacaoEnderecoService.atualizar(enderecoId, locaEndereco);
        if (locEndAtualizado != null)
            return ResponseEntity.ok(locEndAtualizado);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

}
