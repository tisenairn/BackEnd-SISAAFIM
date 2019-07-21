package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.events.RecursoCriadoEvento;
import br.gov.rn.saogoncalo.smtsis.models.imovel.ImovelEndereco;
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
@RequestMapping("")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private LocalizacaoEnderecoService localizacaoEnderecoService;

    @Autowired
    private ApplicationEventPublisher publisher;

    @GetMapping("endereco")
    public ResponseEntity<List<ImovelEndereco>> buscarTodos(){
        List<ImovelEndereco> listaImovelEnderecos = enderecoService.buscarTodos();
        if (listaImovelEnderecos.size() > 0){
            return ResponseEntity.ok(listaImovelEnderecos);
        }
        return ResponseEntity.noContent().build();
    }

    @GetMapping("endereco/{id}")
    public ResponseEntity<ImovelEndereco> buscarPorID(@PathVariable Long id){
        ImovelEndereco imovelEndereco = enderecoService.buscarPorId(id);
        if (Optional.ofNullable(imovelEndereco).isPresent())
            return ResponseEntity.ok(imovelEndereco);
        return ResponseEntity.notFound().build();
    }

    @PostMapping("imovelEndereco")
    public ResponseEntity<ImovelEndereco> salvar(@RequestBody @Valid ImovelEndereco imovelEndereco
            , HttpServletResponse servletResponse) {
        if (imovelEndereco != null ){
            ImovelEndereco imovelEnderecoSalvo = enderecoService.salvar(imovelEndereco);
            publisher.publishEvent(new RecursoCriadoEvento(this,
                    servletResponse,
                    imovelEnderecoSalvo.getId()));
            return ResponseEntity.status(HttpStatus.CREATED).body(imovelEnderecoSalvo);
        }
        return ResponseEntity.noContent().build();
    }

    @PutMapping("imovelEndereco")
    public ResponseEntity<ImovelEndereco> atualizar(@RequestBody ImovelEndereco imovelEndereco){
        if (Optional.ofNullable(enderecoService.atualizar(imovelEndereco)).isPresent())
            return ResponseEntity.accepted().body(imovelEndereco);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("endereco/{id}")
    public ResponseEntity<ImovelEndereco> deleta(@PathVariable Long id){
        if (enderecoService.deleta(id))
            return ResponseEntity.noContent().build();
        return ResponseEntity.badRequest().build();
    }

}
