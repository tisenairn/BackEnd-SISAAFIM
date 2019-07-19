package br.gov.rn.saogoncalo.smtsis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.rn.saogoncalo.smtsis.models.Benfeitorias;

@Repository
public interface BenfeitoriasRepository extends JpaRepository<Benfeitorias, Long> {

}
