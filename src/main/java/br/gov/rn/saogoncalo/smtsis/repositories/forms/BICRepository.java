package br.gov.rn.saogoncalo.smtsis.repositories.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BICRepository extends JpaRepository<BoletimIncricaoCadastral, Long> {}
