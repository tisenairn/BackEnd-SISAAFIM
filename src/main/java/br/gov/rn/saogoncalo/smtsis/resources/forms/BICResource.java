package br.gov.rn.saogoncalo.smtsis.resources.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.resources.GenericResourceController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("bic")
public class BICResource extends GenericResourceController<BoletimIncricaoCadastral> { }
