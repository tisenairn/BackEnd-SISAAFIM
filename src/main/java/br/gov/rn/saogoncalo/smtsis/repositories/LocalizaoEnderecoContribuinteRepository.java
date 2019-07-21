package br.gov.rn.saogoncalo.smtsis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.gov.rn.saogoncalo.smtsis.models.LocalizacaoEnderecoContribuinte;

@Repository
public interface LocalizaoEnderecoContribuinteRepository extends JpaRepository<LocalizacaoEnderecoContribuinte, Long> {
	@Query("SELECT l FROM LocalizacaoEnderecoContribuinte l where l.endereco.id = :id")
    Optional<LocalizacaoEnderecoContribuinte> findByEnderecoId(@Param("id") Long id);
}
