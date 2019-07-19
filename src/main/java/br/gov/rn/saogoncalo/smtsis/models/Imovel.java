package br.gov.rn.saogoncalo.smtsis.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEndereco", referencedColumnName = "id",unique = true)
    private Endereco endereco;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codigoInfoEdificacao", referencedColumnName = "id_info_edificacao", insertable = false, updatable = false, unique = true)
    private InfoEdificacao infoEdificacao;


    public Long getId() {
        return id;
    }

    public InfoEdificacao getInfoEdificacao() {
        return infoEdificacao;
    }

    public void setInfoEdificacao(InfoEdificacao infoEdificacao) {
        this.infoEdificacao = infoEdificacao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    @Override
    public String toString() {
        return "Imovel{" +
                "id=" + id +
                ", endereco=" + endereco +
                ", infoEdificacao=" + infoEdificacao +
                '}';
    }

}
