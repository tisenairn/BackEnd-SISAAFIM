package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.enums.TipoLogradouro;
import br.gov.rn.saogoncalo.smtsis.enums.TipoSubunidade;
import br.gov.rn.saogoncalo.smtsis.enums.UnidadeFederativa;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contribuintes_endereco")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class ContribuinteEndereco {
// Entidade não obrigatória, ou seja, tudo nesta entidade pode ser nulo.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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