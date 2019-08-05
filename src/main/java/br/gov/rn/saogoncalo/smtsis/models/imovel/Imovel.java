package br.gov.rn.saogoncalo.smtsis.models.imovel;

import br.gov.rn.saogoncalo.smtsis.enums.Loteamento;
import br.gov.rn.saogoncalo.smtsis.enums.TipoNatureza;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis")
public class Imovel extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Long id;
    private String inscricao;
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private TipoNatureza natureza;
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Loteamento loteamento;
//    TODO após os testes, deverá ser um valor único para o banco de dados.
//  @Column(columnDefinition = "INT(9) UNSIGNED", unique = true)
    @Column(columnDefinition = "INT(9) UNSIGNED")
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
    @ManyToOne(cascade = CascadeType.ALL)  // relacionamento peculiar
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
                ", inscricao='" + inscricao + '\'' +
                ", natureza=" + natureza +
                ", loteamento=" + loteamento +
                ", sequencial=" + sequencial +
                ", quadra='" + quadra + '\'' +
                ", lote='" + lote + '\'' +
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

    public void setId(Long id) {
        this.id = id;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public TipoNatureza getNatureza() {
        return natureza;
    }

    public void setNatureza(TipoNatureza natureza) {
        this.natureza = natureza;
    }

    public Loteamento getLoteamento() {
        return loteamento;
    }

    public void setLoteamento(Loteamento loteamento) {
        this.loteamento = loteamento;
    }

    public int getSequencial() {
        return sequencial;
    }

    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
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

    public InfoUnidade getInfoUnidade() {
        return infoUnidade;
    }

    public void setInfoUnidade(InfoUnidade infoUnidade) {
        this.infoUnidade = infoUnidade;
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
