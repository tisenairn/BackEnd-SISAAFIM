package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "localizacoes")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class LocalizacaoEndereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_localizacao")
    private Long id;

    //@NotNull
    //@NotEmpty
    @Size(max = 25,message = "A latitude não pode ter mais de 25 caracteres.")
    private String latitude;

    //@NotNull
    //@NotEmpty
    @Size(max = 25,message = "A longitude não pode ter mais de 25 caracteres.")
    private String longitude;

}

