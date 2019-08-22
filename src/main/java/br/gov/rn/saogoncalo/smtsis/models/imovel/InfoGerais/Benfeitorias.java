package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "imoveis_benfeitorias")
@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter, @Setter and @RequiredArgsConstructor!
public class Benfeitorias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_benfeitorias")
    private Long id;

    private boolean agua;

    private boolean sarjetas;

    private boolean esgoto;

    private boolean redeEletrica;

    private boolean limpezaUrbana;

    private boolean iluminacaoPublica;

    private boolean pavimentacao;

    private boolean telefone;

    private boolean galPluviais;

    private boolean coletaLixo;
}