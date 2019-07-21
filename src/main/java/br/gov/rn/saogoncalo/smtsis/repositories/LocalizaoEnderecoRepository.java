package br.gov.rn.saogoncalo.smtsis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.rn.saogoncalo.smtsis.models.imovel.LocalizacaoEnderecoImovel;

import java.util.Optional;

public interface LocalizaoEnderecoRepository extends JpaRepository<LocalizacaoEnderecoImovel, Long> {

    @Query("SELECT l FROM LocalizacaoEnderecoImovel l where l.endereco.id = :id")
    Optional<LocalizacaoEnderecoImovel> findByEnderecoId(@Param("id") Long id);
}