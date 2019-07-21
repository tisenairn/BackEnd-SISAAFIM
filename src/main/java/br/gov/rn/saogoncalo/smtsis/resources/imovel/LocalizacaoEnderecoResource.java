package br.gov.rn.saogoncalo.smtsis.resources.imovel;

import br.gov.rn.saogoncalo.smtsis.models.imovel.LocalizacaoEnderecoImovel;
import br.gov.rn.saogoncalo.smtsis.services.imovel.LocalizacaoEnderecoImovelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("v1")
public class LocalizacaoEnderecoResource {

    @Autowired
    private LocalizacaoEnderecoImovelService localizacaoEnderecoService;

    @GetMapping("localizacaoEndereco")
    public ResponseEntity<List<LocalizacaoEnderecoImovel>> buscarTodos(){
        List<LocalizacaoEnderecoImovel> localizacaoEnderecos =
                localizacaoEnderecoService.buscarTodos();
        if (localizacaoEnderecos != null)
            return ResponseEntity.ok().body(localizacaoEnderecos);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEnderecoImovel> salvar(@RequestBody@Valid LocalizacaoEnderecoImovel localizacaoEndereco
                                                        ,@PathVariable Long enderecoId){
    	LocalizacaoEnderecoImovel locEndSalvar = localizacaoEnderecoService.salvar(localizacaoEndereco, enderecoId);
        if (locEndSalvar != null)
            return ResponseEntity.status(HttpStatus.CREATED).body(locEndSalvar);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

    @GetMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEnderecoImovel> buscarPorId(@PathVariable Long id){
    	LocalizacaoEnderecoImovel localEndEncotrada = localizacaoEnderecoService.buscarPorId(id);
        if (localEndEncotrada != null)
            return ResponseEntity.ok(localEndEncotrada);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("localizacaoEndereco/{id}")
    public ResponseEntity<LocalizacaoEnderecoImovel> deletePorId(@PathVariable Long id){
        if (localizacaoEnderecoService.deletePorId(id))
            return ResponseEntity.ok().build();
        return ResponseEntity.noContent().build();
    }

    @PutMapping("localizacaoEndereco/{enderecoId}")
    public ResponseEntity<LocalizacaoEnderecoImovel> atualizar(@PathVariable Long enderecoId,
                                                         @RequestBody LocalizacaoEnderecoImovel locaEndereco){
    	LocalizacaoEnderecoImovel locEndAtualizado = localizacaoEnderecoService.atualizar(enderecoId, locaEndereco);
        if (locEndAtualizado != null)
            return ResponseEntity.ok(locEndAtualizado);
        return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }

}
