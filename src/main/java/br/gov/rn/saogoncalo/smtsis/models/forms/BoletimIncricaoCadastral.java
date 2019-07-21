package br.gov.rn.saogoncalo.smtsis.models.forms;

import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Fiscal;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "boletim_inscricao_cadastral")
public class BoletimIncricaoCadastral {

//    TODO Fazer seu CRUD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_BIC")
    private Long id;
    private boolean ativo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bic_fiscal", referencedColumnName = "id_fiscal", unique = true)
    private Fiscal fiscal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bic_contribuinte", referencedColumnName = "id_contribuinte", unique = true)
    private Contribuinte contribuinte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Fiscal getFiscal() {
        return fiscal;
    }

    public void setFiscal(Fiscal fiscal) {
        this.fiscal = fiscal;
    }

    public Contribuinte getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoletimIncricaoCadastral that = (BoletimIncricaoCadastral) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
