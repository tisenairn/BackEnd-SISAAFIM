package br.gov.rn.saogoncalo.smtsis.models.formulario;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "boletim_inscricao_cadastral")
public class BoletimIncricaoCadastral extends AuditedEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_BIC")
    private Long id;

    @JsonManagedReference
    @OneToMany(mappedBy = "boletim", cascade = CascadeType.ALL)
    private Collection<BICAudited> auditoria;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_bic_imovel", referencedColumnName = "id_imovel", updatable = false)
    private Imovel imovel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Collection<BICAudited> getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Collection<BICAudited> auditoria) {
        this.auditoria = auditoria;
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