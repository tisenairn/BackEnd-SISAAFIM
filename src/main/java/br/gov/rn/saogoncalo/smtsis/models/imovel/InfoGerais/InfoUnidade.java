package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.Limitacao;
import br.gov.rn.saogoncalo.smtsis.enums.Patrimonio;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "informacoes_unidade")
@Getter @Setter @EqualsAndHashCode @ToString
public class InfoUnidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infoUnidade")
    private Long id;

    private double areaTerreno;
    private double testadaPrincipal;
    private double profundidadePrincipal;
    private double areaContruidaUnidade;
    private double areaTotalConstruida;

    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Limitacao limitacao;
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private Patrimonio patrimonio;


}
