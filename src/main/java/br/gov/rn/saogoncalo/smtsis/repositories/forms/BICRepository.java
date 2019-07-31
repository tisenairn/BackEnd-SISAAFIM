package br.gov.rn.saogoncalo.smtsis.repositories.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BICRepository extends GenericRepository<BoletimIncricaoCadastral> { }
