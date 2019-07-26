package br.gov.rn.saogoncalo.smtsis.models.imovel;

import br.gov.rn.saogoncalo.smtsis.enums.Loteamento;
import br.gov.rn.saogoncalo.smtsis.enums.TipoNatureza;
import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Long id;
    private String inscricao;
    private TipoNatureza natureza;
    private Loteamento loteamento;
    @Column(columnDefinition = "INT(9) UNSIGNED", unique = true)
    private int sequencial;
    @Column(length = 5)
    private String quadra;
    @Column(length = 11)
    private String lote;


    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_endereco", referencedColumnName = "id_endereco", unique = true)
    private ImovelEndereco imovelEndereco;

    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_contribuinte", referencedColumnName = "id_contribuinte", unique = true)
    private Contribuinte contribuinte;

    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_unidade", referencedColumnName = "id_infoUnidade", unique = true)
    private InfoUnidade infoUnidade;

    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_edificacao", referencedColumnName = "id_infoEdificacao", unique = true)
    private InfoEdificacao infoEdificacao;

    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_terreno", referencedColumnName = "id_infoTerreno", unique = true)
    private InfoTerreno infoTerreno;

    //@NotNull
    //@NotEmpty
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_benfeitorias", referencedColumnName = "id_benfeitorias", unique = true)
    private Benfeitorias benfeitorias;

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", imovelEndereco=" + imovelEndereco +
                ", contribuinte=" + contribuinte +
                ", infoUnidade=" + infoUnidade +
                ", infoEdificacao=" + infoEdificacao +
                ", infoTerreno=" + infoTerreno +
                ", benfeitorias=" + benfeitorias +
                '}';
    }

    public Long getId() {
        return id;
    }

    public InfoUnidade getInfoUnidade() {
        return infoUnidade;
    }

    public void setInfoUnidade(InfoUnidade infoUnidade) {
        this.infoUnidade = infoUnidade;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public ImovelEndereco getImovelEndereco() {
        return imovelEndereco;
    }

    public void setImovelEndereco(ImovelEndereco imovelEndereco) {
        this.imovelEndereco = imovelEndereco;
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public InfoEdificacao getInfoEdificacao() {
        return infoEdificacao;
    }

    public void setInfoEdificacao(InfoEdificacao infoEdificacao) {
        this.infoEdificacao = infoEdificacao;
    }

    public InfoTerreno getInfoTerreno() {
        return infoTerreno;
    }

    public void setInfoTerreno(InfoTerreno infoTerreno) {
        this.infoTerreno = infoTerreno;
    }

    public Benfeitorias getBenfeitorias() {
        return benfeitorias;
    }

    public void setBenfeitorias(Benfeitorias benfeitorias) {
        this.benfeitorias = benfeitorias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Objects.equals(id, imovel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
