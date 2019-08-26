package br.gov.rn.saogoncalo.smtsis.resources.formulario;

import br.gov.rn.saogoncalo.smtsis.models.formulario.ProcessoImobiliario;
import br.gov.rn.saogoncalo.smtsis.resources.GenericResourceController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processo")
public class ProcessoImobiliarioResource extends GenericResourceController<ProcessoImobiliario> {}
