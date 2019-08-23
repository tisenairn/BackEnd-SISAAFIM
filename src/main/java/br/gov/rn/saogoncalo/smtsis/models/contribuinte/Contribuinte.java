package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "contribuintes")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class Contribuinte extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_contribuinte")
    private Long id;
    //@NotNull
    //@NotEmpty
    private String cpfCnpj;
    //@NotNull
    //@NotEmpty
    private String nome;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String telefoneResidencial;
    @Column(nullable = true)
    private String telefoneComercial;
    @Column(nullable = true)
    private String fax;
    @Column(nullable = true)
    private String celular;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contribuinte_endereco", referencedColumnName = "id_endereco", unique = true)
    private ContribuinteEndereco contribuinteEndereco;

    //  mappedBy referencia a instância deste objeto na classe imovel.
    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "contribuinteId", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private Collection<Imovel> imovel;
    public Contribuinte(){
    }

}
