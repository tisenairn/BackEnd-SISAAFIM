package br.gov.rn.saogoncalo.smtsis.resources.formulario;

import br.gov.rn.saogoncalo.smtsis.models.formulario.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.resources.GenericResourceController;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("bic")
public class BICResource extends GenericResourceController<BoletimIncricaoCadastral> { }
