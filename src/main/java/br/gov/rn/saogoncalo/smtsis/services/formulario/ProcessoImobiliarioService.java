package br.gov.rn.saogoncalo.smtsis.services.formulario;

import br.gov.rn.saogoncalo.smtsis.models.formulario.ProcessoImobiliario;
import br.gov.rn.saogoncalo.smtsis.services.GenericService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProcessoImobiliarioService extends GenericService<ProcessoImobiliario> { }
