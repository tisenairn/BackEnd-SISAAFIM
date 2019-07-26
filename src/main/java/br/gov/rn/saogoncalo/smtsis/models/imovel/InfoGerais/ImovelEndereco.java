package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.Bairro;
import br.gov.rn.saogoncalo.smtsis.enums.Edificio;
import br.gov.rn.saogoncalo.smtsis.enums.TipoSubunidade;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis_endereco")
public class ImovelEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;

    private String endereco;
    @Column(length = 5)
    private int numero;
    @Column(length = 6)
    private String bloco;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoSubunidade subunidade;
    @Column(length = 4)
    private String numeroSubunidade;
    @Column(length = 9)
    private String cep;
//    TODO Testar o RANGE do bairro, para saber se precisa ser maior que o TINYINT
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Bairro bairro;
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Edificio edificio;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco_localizacao", referencedColumnName = "id_localizacao", unique = true)
    private LocalizacaoEndereco localizacaoEndereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public TipoSubunidade getSubunidade() {
        return subunidade;
    }

    public void setSubunidade(TipoSubunidade subunidade) {
        this.subunidade = subunidade;
    }

    public String getNumeroSubunidade() {
        return numeroSubunidade;
    }

    public void setNumeroSubunidade(String numeroSubunidade) {
        this.numeroSubunidade = numeroSubunidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public LocalizacaoEndereco getLocalizacaoEndereco() {
        return localizacaoEndereco;
    }

    public void setLocalizacaoEndereco(LocalizacaoEndereco localizacaoEndereco) {
        this.localizacaoEndereco = localizacaoEndereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImovelEndereco that = (ImovelEndereco) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ImovelEndereco{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", numero=" + numero +
                ", bloco='" + bloco + '\'' +
                ", subunidade=" + subunidade +
                ", numeroSubunidade='" + numeroSubunidade + '\'' +
                ", cep='" + cep + '\'' +
                ", bairro=" + bairro +
                ", edificio=" + edificio +
                ", localizacaoEndereco=" + localizacaoEndereco +
                '}';
    }
}
