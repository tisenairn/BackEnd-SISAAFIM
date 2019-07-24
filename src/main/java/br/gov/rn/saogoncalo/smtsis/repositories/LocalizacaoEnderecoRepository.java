package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais.LocalizacaoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
// TODO
// Erro interno com duplicatas
public interface LocalizacaoEnderecoRepository extends JpaRepository<LocalizacaoEndereco, Long> {

    @Override
    @Query("select l, e.id \n" +
            "as id_endereco, e.bairro \n" +
            "from LocalizacaoEndereco l inner join ContribuinteEndereco e\n" +
            "ON l.id = e.id\n" +
            "where e.id = :id")
    Optional<LocalizacaoEndereco> findById(Long id);
}
