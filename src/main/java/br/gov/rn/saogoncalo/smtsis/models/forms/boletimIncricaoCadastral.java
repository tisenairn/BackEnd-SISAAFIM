package br.gov.rn.saogoncalo.smtsis.models.forms;

import br.gov.rn.saogoncalo.smtsis.models.Contribuinte;

import javax.persistence.*;

@Entity
@Table(name = "boletim_inscricao_cadastral")
public class boletimIncricaoCadastral extends Contribuinte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_BIC")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_bci", referencedColumnName = "id_contribuinte", unique = true)
    private Contribuinte contribuinte;

}
