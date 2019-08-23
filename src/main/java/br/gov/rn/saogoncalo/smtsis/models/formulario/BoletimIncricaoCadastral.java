package br.gov.rn.saogoncalo.smtsis.models.formulario;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "boletim_inscricao_cadastral")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class BoletimIncricaoCadastral extends AuditedEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

}