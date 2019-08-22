package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "informacoes_edificacao")
@Getter @Setter @EqualsAndHashCode @ToString
public class InfoEdificacao {

//    TODO Criar tratamento de exceção para o tamanho máximo do RANGE.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infoEdificacao")
    private Long id;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoImovel tipoImovel;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private TipoEstrutura tipoEstrutura;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private UtilizacaoImovel utilizacaoImovel;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private PadraoQualidade padraoQualidade;

}
