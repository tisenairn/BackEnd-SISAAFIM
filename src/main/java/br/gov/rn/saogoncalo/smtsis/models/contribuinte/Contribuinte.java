package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "contribuintes")
public class Contribuinte extends AuditedEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contribuinte")
    private Long id;
    //@NotNull
    //@NotEmpty
    private String cpfCnpj;
    //@NotNull
    //@NotEmpty
    private String nome;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String telefoneResidencial;
    @Column(nullable = true)
    private String telefoneComercial;
    @Column(nullable = true)
    private String fax;
    @Column(nullable = true)
    private String celular;

//  mappedBy referencia a instância deste objeto na classe imovel.
    @JsonManagedReference
    @OneToMany(mappedBy = "contribuinte", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private Collection<Imovel> imovel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contribuinte_endereco", referencedColumnName = "id_endereco", unique = true)
    private ContribuinteEndereco contribuinteEndereco;

    public Contribuinte(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneComercial() {
        return telefoneComercial;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        this.telefoneComercial = telefoneComercial;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public ContribuinteEndereco getContribuinteEndereco() {
        return contribuinteEndereco;
    }

    public void setContribuinteEndereco(ContribuinteEndereco contribuinteEndereco) {
        this.contribuinteEndereco = contribuinteEndereco;
    }

    @Override
    public String toString() {
        return "Contribuinte{" +
                "id=" + id +
                ", cpfCnpj='" + cpfCnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefoneResidencial='" + telefoneResidencial + '\'' +
                ", telefoneComercial='" + telefoneComercial + '\'' +
                ", fax='" + fax + '\'' +
                ", celular='" + celular + '\'' +
                ", contribuinteEndereco=" + contribuinteEndereco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contribuinte that = (Contribuinte) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
