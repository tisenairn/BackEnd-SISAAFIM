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

    private String inscricaoImovel;

    @JsonManagedReference
    @OneToMany(mappedBy = "boletim", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Column(nullable = false, name = "id_bic_auditoria")
    private Collection<BICAudited> auditoria;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_bic_imovel", referencedColumnName = "id_imovel", updatable = false)
    private Imovel imovelId;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getInscricaoImovel() {
        return inscricaoImovel;
    }

    public void setInscricaoImovel(String inscricaoImovel) {
        this.inscricaoImovel = inscricaoImovel;
    }

    public Collection<BICAudited> getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Collection<BICAudited> auditoria) {
        this.auditoria = auditoria;
    }

    public Imovel getImovelId() {
        return imovelId;
    }

    public void setImovelId(Imovel imovelId) {
        this.imovelId = imovelId;
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