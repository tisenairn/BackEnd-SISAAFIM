package br.gov.rn.saogoncalo.smtsis.models;

import br.gov.rn.saogoncalo.smtsis.enums.*;

import java.util.Objects;

public class InfoEdificacao {

    private Long id;
    private TipoImovel tipoImovel;
    private UtilizacaoImovel utilizacaoImovel;
    private PadraoQualidade padraoQualidade;
    private Pedologia pedologia;
    private Topografia topografia;
    private EstadoConservacao estadoConservacao;
    private SituacaoTerreno situacaoTerreno;

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

    @Override
    public String toString() {
        return "InfoEdificacao{" +
                "id=" + id +
                ", tipoImovel=" + tipoImovel +
                ", utilizacaoImovel=" + utilizacaoImovel +
                ", padraoQualidade=" + padraoQualidade +
                ", pedologia=" + pedologia +
                ", topografia=" + topografia +
                ", estadoConservacao=" + estadoConservacao +
                ", situacaoTerreno=" + situacaoTerreno +
                '}';
    }

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
}
