package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.Bairro;
import br.gov.rn.saogoncalo.smtsis.enums.Edificio;
import br.gov.rn.saogoncalo.smtsis.enums.TipoSubunidade;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis_endereco")
@Getter @Setter @EqualsAndHashCode @ToString
public class ImovelEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;

    private String endereco;
    @Column(length = 5)
    private int numero;
    @Column(length = 6)
    private String bloco;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoSubunidade subunidade;
    @Column(length = 4)
    private String numeroSubunidade;
    @Column(length = 9)
    private String cep;
//    TODO Testar o RANGE do bairro, para saber se precisa ser maior que o TINYINT
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Bairro bairro;
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Edificio edificio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco_localizacao", referencedColumnName = "id_localizacao", unique = true)
    private LocalizacaoEndereco localizacaoEndereco;

}
