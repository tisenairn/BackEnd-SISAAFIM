package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    @Override
    @Query("select l, e.id \n" +
            "as id, e.bairro \n" +
            "from Imovel l inner join ContribuinteEndereco e\n" +
            "ON l.id = e.id\n" +
            "where e.id = :id")
    Optional<Imovel> findById(Long id);
}