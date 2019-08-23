package br.gov.rn.saogoncalo.smtsis.repositories.formulario;

import br.gov.rn.saogoncalo.smtsis.models.formulario.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BICRepository extends GenericRepository<BoletimIncricaoCadastral> { }
