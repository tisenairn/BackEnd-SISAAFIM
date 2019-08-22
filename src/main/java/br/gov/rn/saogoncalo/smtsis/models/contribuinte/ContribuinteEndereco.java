package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.enums.TipoLogradouro;
import br.gov.rn.saogoncalo.smtsis.enums.TipoSubunidade;
import br.gov.rn.saogoncalo.smtsis.enums.UnidadeFederativa;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contribuintes_endereco")
@Getter @Setter @EqualsAndHashCode @ToString
public class ContribuinteEndereco {
// Entidade não obrigatória, ou seja, tudo nesta entidade pode ser nulo.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;
    private boolean possuiEnderecoCorrespondecia;

    private String caixaPostal;
    private String codLogradouro;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;
    @Column(length = 5)
    private int  numero;
    @Column(length = 2)
    private String bloco;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoSubunidade tipoSubunidade;
    private int numeroSubunidade;
    private String cep;
    private String bairro;
    private String cidade;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private UnidadeFederativa uf;

}