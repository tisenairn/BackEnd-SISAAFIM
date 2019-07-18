package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.LocalizacaoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface LocalizaoEnderecoRepository extends JpaRepository<LocalizacaoEndereco, Long> {

    @Query("SELECT l FROM LocalizacaoEndereco l where l.endereco.id = :id")
    Optional<LocalizacaoEndereco> findByEnderecoId(@Param("id") Long id);
}