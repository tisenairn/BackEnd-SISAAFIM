package br.gov.rn.saogoncalo.smtsis.models.imovel;

import br.gov.rn.saogoncalo.smtsis.enums.Loteamento;
import br.gov.rn.saogoncalo.smtsis.enums.TipoNatureza;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import br.gov.rn.saogoncalo.smtsis.models.formulario.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
@Entity
@Table(name = "imoveis")
public class Imovel extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imovel", nullable = false, unique = true)
    private Long id;
    private String inscricao;
    @Column(columnDefinition = "TINYINT(1) UNSIGNED")
    private TipoNatureza natureza;
    @Column(columnDefinition = "TINYINT(3) UNSIGNED")
    private Loteamento loteamento;
//    TODO após os testes, deverá ser um valor único para o banco de dados.
//  @Column(columnDefinition = "INT(9) UNSIGNED", unique = true)
    @Column(columnDefinition = "INT(9) UNSIGNED")
    private int sequencial;
    @Column(length = 5)
    private String quadra;
    @Column(length = 11)
    private String lote;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_endereco", referencedColumnName = "id_endereco", unique = true)
    private ImovelEndereco imovelEndereco;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_imovel_contribuinte", referencedColumnName = "id_contribuinte", updatable = false)
    private Contribuinte contribuinte;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_unidade", referencedColumnName = "id_infoUnidade", unique = true)
    private InfoUnidade infoUnidade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_edificacao", referencedColumnName = "id_infoEdificacao", unique = true)
    private InfoEdificacao infoEdificacao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_terreno", referencedColumnName = "id_infoTerreno", unique = true)
    private InfoTerreno infoTerreno;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_imovel_benfeitorias", referencedColumnName = "id_benfeitorias", unique = true)
    private Benfeitorias benfeitorias;

    @JsonManagedReference
    @OneToMany(mappedBy = "imovelId", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private Collection<BoletimIncricaoCadastral> boletimIncricaoCadastral;


    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {
    }
}
