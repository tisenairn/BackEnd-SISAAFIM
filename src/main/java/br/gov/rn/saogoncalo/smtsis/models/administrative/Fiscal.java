package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "fiscais")
public class Fiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_fiscal")
    private Long id;

    //@NotNull
    //@NotEmpty
    private String observacoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fiscal_usuario", referencedColumnName = "id_usuario", unique = true)
    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiscal fiscal = (Fiscal) o;
        return Objects.equals(id, fiscal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
