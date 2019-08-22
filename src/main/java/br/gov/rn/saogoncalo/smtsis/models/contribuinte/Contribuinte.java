package br.gov.rn.saogoncalo.smtsis.models.contribuinte;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "contribuintes")
@Getter @Setter @EqualsAndHashCode @ToString
public class Contribuinte extends AuditedEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

//  mappedBy referencia a instância deste objeto na classe imovel.
    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "contribuinte", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private Collection<Imovel> imovel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_contribuinte_endereco", referencedColumnName = "id_endereco", unique = true)
    private ContribuinteEndereco contribuinteEndereco;

    public Contribuinte(){
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}
