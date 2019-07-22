package br.gov.rn.saogoncalo.smtsis.models.imovel;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "localizacoes")
public class LocalizacaoEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private Long id;

    //@NotNull
    //@NotEmpty
    @Size(max = 25,message = "A latitude não pode ter mais de 25 caracteres.")
    private String latitude;

    //@NotNull
    //@NotEmpty
    @Size(max = 25,message = "A longitude não pode ter mais de 25 caracteres.")
    private String longitude;

//    Em 20/07, achei estranho porque para registrar uma localização, eu teria que ter um endereço criado,
//    para então cadastrar uma localização. achei mais eficaz, relacionar da seguinte maneira:
//    Um endereço tem uma localização. -- Lindson

    //    @JsonIgnore
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_localizacao_endereco", referencedColumnName = "id_endereco", unique = true)
//    private ContribuinteEndereco endereco;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocalizacaoEndereco that = (LocalizacaoEndereco) o;
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
