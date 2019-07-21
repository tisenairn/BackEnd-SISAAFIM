package br.gov.rn.saogoncalo.smtsis.resources.forms;

import br.gov.rn.saogoncalo.smtsis.events.RecursoCriadoEvento;
import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.services.forms.BICService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("bic")
public class BICResource {

    @Autowired
    BICService bicService;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @GetMapping("/listar")
    public ResponseEntity<List<BoletimIncricaoCadastral>> buscarTodos(){
        List<BoletimIncricaoCadastral> bicResposta = bicService.buscarTodos();

    return bicResposta.size() > 0 ? ResponseEntity.ok().body(bicResposta) : ResponseEntity.noContent().build();
    }

    @PostMapping("/salvar")
    public ResponseEntity<BoletimIncricaoCadastral> salvar(@Valid @RequestBody BoletimIncricaoCadastral bic,
                                                           HttpServletResponse resposta){
        bic.setAtivo(true);
        BoletimIncricaoCadastral bicResposta = bicService.salvar(bic);
        applicationEventPublisher.publishEvent(new RecursoCriadoEvento(this, resposta, bicResposta.getId()));
        return ResponseEntity.status(HttpStatus.CREATED).body(bicResposta);
    }
}
