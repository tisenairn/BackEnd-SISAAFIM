package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.EstadoConservacao;
import br.gov.rn.saogoncalo.smtsis.enums.Pedologia;
import br.gov.rn.saogoncalo.smtsis.enums.SituacaoTerreno;
import br.gov.rn.saogoncalo.smtsis.enums.Topografia;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "informacoes_terreno")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class InfoTerreno {

    //    TODO Criar tratamento de exceção para o tamanho máximo do RANGE.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_infoTerreno")
    private Long id;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Pedologia pedologia;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Topografia topografia;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private EstadoConservacao estadoConservacao;
    //@NotNull
    //@NotEmpty
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private SituacaoTerreno situacaoTerreno;

}
