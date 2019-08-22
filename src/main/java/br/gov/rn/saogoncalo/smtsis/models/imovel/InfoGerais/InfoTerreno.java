package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.EstadoConservacao;
import br.gov.rn.saogoncalo.smtsis.enums.Pedologia;
import br.gov.rn.saogoncalo.smtsis.enums.SituacaoTerreno;
import br.gov.rn.saogoncalo.smtsis.enums.Topografia;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "informacoes_terreno")
@Getter @Setter @EqualsAndHashCode @ToString
public class InfoTerreno {

    //    TODO Criar tratamento de exceção para o tamanho máximo do RANGE.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
