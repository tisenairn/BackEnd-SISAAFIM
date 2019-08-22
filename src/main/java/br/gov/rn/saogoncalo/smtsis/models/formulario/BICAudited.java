package br.gov.rn.saogoncalo.smtsis.models.formulario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "bic_audited")
@Getter @Setter @EqualsAndHashCode @ToString
public class BICAudited {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
