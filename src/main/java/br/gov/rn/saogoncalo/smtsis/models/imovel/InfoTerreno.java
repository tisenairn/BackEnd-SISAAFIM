package br.gov.rn.saogoncalo.smtsis.models.imovel;

import br.gov.rn.saogoncalo.smtsis.enums.EstadoConservacao;
import br.gov.rn.saogoncalo.smtsis.enums.Pedologia;
import br.gov.rn.saogoncalo.smtsis.enums.SituacaoTerreno;
import br.gov.rn.saogoncalo.smtsis.enums.Topografia;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "informacoes_terreno")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedologia getPedologia() {
        return pedologia;
    }

    public void setPedologia(Pedologia pedologia) {
        this.pedologia = pedologia;
    }

    public Topografia getTopografia() {
        return topografia;
    }

    public void setTopografia(Topografia topografia) {
        this.topografia = topografia;
    }

    public EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public SituacaoTerreno getSituacaoTerreno() {
        return situacaoTerreno;
    }

    public void setSituacaoTerreno(SituacaoTerreno situacaoTerreno) {
        this.situacaoTerreno = situacaoTerreno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoTerreno that = (InfoTerreno) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
