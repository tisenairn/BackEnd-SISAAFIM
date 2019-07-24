package br.gov.rn.saogoncalo.smtsis.models.imovel.InfoGerais;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "imoveis_benfeitorias")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public boolean isSarjetas() {
        return sarjetas;
    }

    public void setSarjetas(boolean sarjetas) {
        this.sarjetas = sarjetas;
    }

    public boolean isEsgoto() {
        return esgoto;
    }

    public void setEsgoto(boolean esgoto) {
        this.esgoto = esgoto;
    }

    public boolean isRedeEletrica() {
        return redeEletrica;
    }

    public void setRedeEletrica(boolean redeEletrica) {
        this.redeEletrica = redeEletrica;
    }

    public boolean isLimpezaUrbana() {
        return limpezaUrbana;
    }

    public void setLimpezaUrbana(boolean limpezaUrbana) {
        this.limpezaUrbana = limpezaUrbana;
    }

    public boolean isIluminacaoPublica() {
        return iluminacaoPublica;
    }

    public void setIluminacaoPublica(boolean iluminacaoPublica) {
        this.iluminacaoPublica = iluminacaoPublica;
    }

    public boolean isPavimentacao() {
        return pavimentacao;
    }

    public void setPavimentacao(boolean pavimentacao) {
        this.pavimentacao = pavimentacao;
    }

    public boolean isTelefone() {
        return telefone;
    }

    public void setTelefone(boolean telefone) {
        this.telefone = telefone;
    }

    public boolean isGalPluviais() {
        return galPluviais;
    }

    public void setGalPluviais(boolean galPluviais) {
        this.galPluviais = galPluviais;
    }

    public boolean isColetaLixo() {
        return coletaLixo;
    }

    public void setColetaLixo(boolean coletaLixo) {
        this.coletaLixo = coletaLixo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Benfeitorias that = (Benfeitorias) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}