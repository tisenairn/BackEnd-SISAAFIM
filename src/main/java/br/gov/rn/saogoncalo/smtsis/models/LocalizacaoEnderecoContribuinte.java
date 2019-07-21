package br.gov.rn.saogoncalo.smtsis.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name = "localizacoes_contribuintes")
public class LocalizacaoEnderecoContribuinte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private Long id;

    @NotNull
    @NotEmpty
    @Size(max = 25,message = "A latitude não pode ter mais de 25 caracteres.")
    private String latitude;

    @NotNull
    @NotEmpty
    @Size(max = 25,message = "A longitude não pode ter mais de 25 caracteres.")
    private String longitude;

//    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco_contribuinte", referencedColumnName = "id",unique = true)
    private EnderecoContribuinte endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public EnderecoContribuinte getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoContribuinte endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalizacaoEnderecoContribuinte that = (LocalizacaoEnderecoContribuinte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LocalizacaoEndereco{" +
                "id=" + id +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
