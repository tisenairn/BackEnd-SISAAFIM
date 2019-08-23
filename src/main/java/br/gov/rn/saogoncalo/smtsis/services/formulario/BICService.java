package br.gov.rn.saogoncalo.smtsis.services.formulario;

import br.gov.rn.saogoncalo.smtsis.models.formulario.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.services.GenericService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BICService extends GenericService<BoletimIncricaoCadastral> {}
