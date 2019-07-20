package br.gov.rn.saogoncalo.smtsis.models;

import br.gov.rn.saogoncalo.smtsis.enums.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "informacoes_edificacao")
public class InfoEdificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infoEdificacao")
    private Long id;
    //@NotNull
    @Size(max = 11)
    private TipoImovel tipoImovel;
    //@NotNull
    @Size(max = 8)
    private UtilizacaoImovel utilizacaoImovel;
    //@NotNull
    @Size(max = 5)
    private PadraoQualidade padraoQualidade;
    //@NotNull
    @Size(max = 16)
    private Pedologia pedologia;
    //@NotNull
    @Size(max = 21)
    private Topografia topografia;
    //@NotNull
    @Size(max = 7)
    private EstadoConservacao estadoConservacao;
    //@NotNull
    @Size(max = 18)
    private SituacaoTerreno situacaoTerreno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoImovel getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(TipoImovel tipoImovel) {
        this.tipoImovel = tipoImovel;
    }

    public UtilizacaoImovel getUtilizacaoImovel() {
        return utilizacaoImovel;
    }

    public void setUtilizacaoImovel(UtilizacaoImovel utilizacaoImovel) {
        this.utilizacaoImovel = utilizacaoImovel;
    }

    public PadraoQualidade getPadraoQualidade() {
        return padraoQualidade;
    }

    public void setPadraoQualidade(PadraoQualidade padraoQualidade) {
        this.padraoQualidade = padraoQualidade;
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
        InfoEdificacao that = (InfoEdificacao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
