package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.PadraoQualidade;
import br.gov.rn.saogoncalo.smtsis.enums.TipoEstrutura;
import br.gov.rn.saogoncalo.smtsis.enums.TipoImovel;
import br.gov.rn.saogoncalo.smtsis.enums.UtilizacaoImovel;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "informacoes_edificacao")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
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
