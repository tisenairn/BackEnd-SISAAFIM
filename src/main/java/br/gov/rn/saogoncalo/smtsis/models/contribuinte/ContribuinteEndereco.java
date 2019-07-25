package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.enums.TipoLogradouro;
import br.gov.rn.saogoncalo.smtsis.enums.TipoSubunidade;
import br.gov.rn.saogoncalo.smtsis.enums.UnidadeFederativa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "contribuintes_endereco")
public class ContribuinteEndereco {
// Entidade não obrigatória, ou seja, tudo nesta entidade pode ser nulo.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long id;
    private boolean possuiEnderecoCorrespondecia;

    private String caixaPostal;
    private String codLogradouro;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;
    @Column(length = 5)
    private int  numero;
    @Column(length = 2)
    private String bloco;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private TipoSubunidade tipoSubunidade;
    private int numeroSubunidade;
    private String cep;
    private String bairro;
    private String cidade;
    @Column(columnDefinition = "TINYINT(2) UNSIGNED")
    private UnidadeFederativa uf;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isPossuiEnderecoCorrespondecia() {
        return possuiEnderecoCorrespondecia;
    }

    public void setPossuiEnderecoCorrespondecia(boolean possuiEnderecoCorrespondecia) {
        this.possuiEnderecoCorrespondecia = possuiEnderecoCorrespondecia;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public String getCodLogradouro() {
        return codLogradouro;
    }

    public void setCodLogradouro(String codLogradouro) {
        this.codLogradouro = codLogradouro;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
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

    public TipoSubunidade getTipoSubunidade() {
        return tipoSubunidade;
    }

    public void setTipoSubunidade(TipoSubunidade tipoSubunidade) {
        this.tipoSubunidade = tipoSubunidade;
    }

    public int getNumeroSubunidade() {
        return numeroSubunidade;
    }

    public void setNumeroSubunidade(int numeroSubunidade) {
        this.numeroSubunidade = numeroSubunidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "ContribuinteEndereco{" +
                "id=" + id +
                ", possuiEnderecoCorrespondecia=" + possuiEnderecoCorrespondecia +
                ", caixaPostal='" + caixaPostal + '\'' +
                ", codLogradouro='" + codLogradouro + '\'' +
                ", tipoLogradouro=" + tipoLogradouro +
                ", nomeLogradouro='" + nomeLogradouro + '\'' +
                ", numero=" + numero +
                ", bloco='" + bloco + '\'' +
                ", tipoSubunidade=" + tipoSubunidade +
                ", numeroSubunidade=" + numeroSubunidade +
                ", cep='" + cep + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf=" + uf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContribuinteEndereco that = (ContribuinteEndereco) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}