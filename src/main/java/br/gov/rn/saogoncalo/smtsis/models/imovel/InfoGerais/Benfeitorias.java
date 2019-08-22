package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis_benfeitorias")
@Getter @Setter @EqualsAndHashCode @ToString
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