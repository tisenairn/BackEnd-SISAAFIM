package br.gov.rn.saogoncalo.smtsis.models;
import javax.persistence.*;

@Entity
@Table(name = "imoveis")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pedologia;
    private String topologia;
    private String conservacao;
    private String terreno;
    private String imposto;
    private String limpeza;
    private String utilizacao;
    private String padraoDeQualidade;
    private String valorPorArea;

    public Imovel(Long id, String pedologia, String topologia, String conservacao, String terreno, String imposto, String limpeza, String utilizacao, String padraoDeQualidade, String valorPorArea) {
        this.id = id;
        this.pedologia = pedologia;
        this.topologia = topologia;
        this.conservacao = conservacao;
        this.terreno = terreno;
        this.imposto = imposto;
        this.limpeza = limpeza;
        this.utilizacao = utilizacao;
        this.padraoDeQualidade = padraoDeQualidade;
        this.valorPorArea = valorPorArea;
    }
    public Imovel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPedologia() {
        return pedologia;
    }

    public void setPedologia(String pedologia) {
        this.pedologia = pedologia;
    }

    public String getTopologia() {
        return topologia;
    }

    public void setTopologia(String topologia) {
        this.topologia = topologia;
    }

    public String getConservacao() {
        return conservacao;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public String getImposto() {
        return imposto;
    }

    public void setImposto(String imposto) {
        this.imposto = imposto;
    }

    public String getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(String limpeza) {
        this.limpeza = limpeza;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    public String getPadraoDeQualidade() {
        return padraoDeQualidade;
    }

    public void setPadraoDeQualidade(String padraoDeQualidade) {
        this.padraoDeQualidade = padraoDeQualidade;
    }

    public String getValorPorArea() {
        return valorPorArea;
    }

    public void setValorPorArea(String valorPorArea) {
        this.valorPorArea = valorPorArea;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Imovel other = (Imovel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Imovel [id=" + id + ", pedologia=" + pedologia + ", topologia=" + topologia + ", conservacao="
                + conservacao + ", terreno=" + terreno + ", imposto=" + imposto + ", limpeza=" + limpeza
                + ", utilizacao=" + utilizacao + ", padraoDeQualidade=" + padraoDeQualidade + ", valorPorArea="
                + valorPorArea + "]";
    }





}
