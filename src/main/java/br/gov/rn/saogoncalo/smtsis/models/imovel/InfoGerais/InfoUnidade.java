package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import br.gov.rn.saogoncalo.smtsis.enums.Limitacao;
import br.gov.rn.saogoncalo.smtsis.enums.Patrimonio;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "informacoes_unidade")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
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
