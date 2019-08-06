package br.gov.rn.saogoncalo.smtsis.models.forms;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Fiscal;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonMerge;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "boletim_inscricao_cadastral")
public class BoletimIncricaoCadastral extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_BIC")
    private Long id;

//  TODO Ao fim dos testes, as chaves estrangeiras do Boletim deverão ser do tipo Fetch Eager
//    @OneToOne(fetch = FetchType.EAGER)
    @JsonMerge
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bic_fiscal", referencedColumnName = "id_fiscal", unique = true)
    private Fiscal fiscal;
// TODO
//    @OneToOne(fetch = FetchType.EAGER)
    @JsonMerge
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bic_imovel", referencedColumnName = "id_imovel", unique = true)
    private Imovel imovel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fiscal getFiscal() {
        return fiscal;
    }

    public void setFiscal(Fiscal fiscal) {
        this.fiscal = fiscal;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
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
