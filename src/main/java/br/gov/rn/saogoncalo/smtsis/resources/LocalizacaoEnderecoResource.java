package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais.LocalizacaoEndereco;
import br.gov.rn.saogoncalo.smtsis.services.LocalizacaoEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("")
public class LocalizacaoEnderecoResource {

    @Autowired
    private LocalizacaoEnderecoService localizacaoEnderecoService;

    @GetMapping("localizacaoEndereco")
    public ResponseEntity<List<LocalizacaoEndereco>> buscarTodos(){
        List<LocalizacaoEndereco> localizacaoEnderecos =
                localizacaoEnderecoService.buscarTodos();
        if (localizacaoEnderecos != null)
            return ResponseEntity.ok().body(localizacaoEnderecos);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEndereco> salvar(@RequestBody @Valid LocalizacaoEndereco localizacaoEndereco,
                                                      @PathVariable Long enderecoId){
        LocalizacaoEndereco locEndSalvar = localizacaoEnderecoService.salvar(localizacaoEndereco, enderecoId);
        if (locEndSalvar != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(locEndSalvar);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

    @GetMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEndereco> buscarPorId(@PathVariable Long id){
        LocalizacaoEndereco localEndEncotrada = localizacaoEnderecoService.buscarPorId(id);
        if (localEndEncotrada != null)
            return ResponseEntity.ok(localEndEncotrada);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEndereco> deletePorId(@PathVariable Long id){
        if (localizacaoEnderecoService.deletePorId(id))
            return ResponseEntity.ok().build();
        return ResponseEntity.noContent().build();
    }
//    TODO Futuramente esse será o único utilizado
    @PutMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEndereco> atualizar(@PathVariable Long enderecoId,
                                                         @RequestBody LocalizacaoEndereco locaEndereco){
        LocalizacaoEndereco locEndAtualizado = localizacaoEnderecoService.atualizar(enderecoId, locaEndereco);
        if (locEndAtualizado != null)
            return ResponseEntity.ok(locEndAtualizado);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

}
