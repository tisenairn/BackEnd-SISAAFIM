package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contribuinte")
public class ContribuinteResource extends GenericResourceController<Contribuinte> { }
