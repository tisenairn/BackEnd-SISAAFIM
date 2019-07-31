package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.Limitacao;
import br.gov.rn.saogoncalo.smtsis.enums.Patrimonio;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "informacoes_unidade")
public class InfoUnidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_infoUnidade")
    private Long id;

    private double areaTerreno;
    private double testadaPrincipal;
    private double profundidadePrincipal;
    private double areaContruidaUnidade;
    private double areaTotalConstruida;

    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Limitacao limitacao;
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Patrimonio patrimonio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    public double getTestadaPrincipal() {
        return testadaPrincipal;
    }

    public void setTestadaPrincipal(double testadaPrincipal) {
        this.testadaPrincipal = testadaPrincipal;
    }

    public double getProfundidadePrincipal() {
        return profundidadePrincipal;
    }

    public void setProfundidadePrincipal(double profundidadePrincipal) {
        this.profundidadePrincipal = profundidadePrincipal;
    }

    public double getAreaContruidaUnidade() {
        return areaContruidaUnidade;
    }

    public void setAreaContruidaUnidade(double areaContruidaUnidade) {
        this.areaContruidaUnidade = areaContruidaUnidade;
    }

    public double getAreaTotalConstruida() {
        return areaTotalConstruida;
    }

    public void setAreaTotalConstruida(double areaTotalConstruida) {
        this.areaTotalConstruida = areaTotalConstruida;
    }

    public Limitacao getLimitacao() {
        return limitacao;
    }

    public void setLimitacao(Limitacao limitacao) {
        this.limitacao = limitacao;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfoUnidade that = (InfoUnidade) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
