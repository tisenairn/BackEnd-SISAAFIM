package br.gov.rn.saogoncalo.smtsis.models.formulario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bic_audited")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class BICAudited {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_bicaudited")
    private Long id;

    //    @Column(unique = true, columnDefinition = "int(7) ZEROFILL", length = 7)
    private int usuarioMatricula;

    private String numeroProtocolo;

    @NotNull
    private String observacoes;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_bicaudited_bic", referencedColumnName = "id_BIC", updatable = false)
    private BoletimIncricaoCadastral boletim;
}
