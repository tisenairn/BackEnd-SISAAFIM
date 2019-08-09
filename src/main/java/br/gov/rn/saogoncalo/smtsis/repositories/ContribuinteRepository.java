package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContribuinteRepository extends GenericRepository<Contribuinte> { }
//    @Override
//    @Query("select l, e.id \n" +
//            "as id_endereco, e.bairro \n" +
//            "from Contribuinte l inner join ContribuinteEndereco e\n" +
//            "ON l.id = e.id\n" +
//            "where e.id = :id")
//    Optional<Contribuinte> findById(Long id);
