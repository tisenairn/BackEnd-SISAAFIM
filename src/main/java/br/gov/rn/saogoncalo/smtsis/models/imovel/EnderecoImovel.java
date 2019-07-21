package br.gov.rn.saogoncalo.smtsis.models.imovel;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "enderecos_imoveis")
public class EnderecoImovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull
    @NotEmpty
    private String uf;
    @NotNull
    @NotEmpty
    private String cidade;
    @NotNull
    @NotEmpty
    private String bairro;
    @NotNull
    @NotEmpty
    private String logradouro;
    @NotNull
    @NotEmpty
    private String complemento;
    @NotNull
    @NotEmpty
    private String cep;
    @NotNull
    @NotEmpty
    private String numero;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnderecoImovel endereco = (EnderecoImovel) o;
        return Objects.equals(id, endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
