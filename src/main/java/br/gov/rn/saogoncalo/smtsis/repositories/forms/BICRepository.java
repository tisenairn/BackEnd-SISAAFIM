package br.gov.rn.saogoncalo.smtsis.repositories.forms;

import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BICRepository extends GenericRepository<BoletimIncricaoCadastral> { }
