package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "fiscais")
public class Fiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fiscal")
    private Long id;
// TODO Anotar com propriedades de conversão do hibernate para data.
//    private Date data;

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
//        TODO Ver se este tipo está funcional.
        this.usuario = usuario;
        this.usuario.setTipo(TipoUsuario.FISCAL);
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
