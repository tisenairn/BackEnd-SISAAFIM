package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.Contribuinte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContribuinteRepository extends JpaRepository<Contribuinte, Long> {
    @Override
    @Query("select l, e.id \n" +
            "as id_endereco, e.bairro \n" +
            "from Contribuinte l inner join Endereco e\n" +
            "ON l.id = e.id\n" +
            "where e.id = :id")
    Optional<Contribuinte> findById(Long id);
}
