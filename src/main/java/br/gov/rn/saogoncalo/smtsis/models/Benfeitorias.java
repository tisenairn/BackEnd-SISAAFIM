package br.gov.rn.saogoncalo.smtsis.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "benfeitorias")
public class Benfeitorias {
	
	 @Id
	 @Column(name = "id")
	 private Long id;
	 @NotNull
	 @NotEmpty
	private boolean agua;
	 @NotNull
	 @NotEmpty
	private boolean sarjetas;
	 @NotNull
	 @NotEmpty
	private boolean esgoto;
	 @NotNull
	 @NotEmpty
	private boolean redeEletrica;
	 @NotNull
	 @NotEmpty
	private boolean limpezaUrbana;
	 @NotNull
	 @NotEmpty
	private boolean iluminacaoPublica;
	 @NotNull
	 @NotEmpty
	private boolean pavimentacao;
	 @NotNull
	 @NotEmpty
	private boolean telefone;
	 @NotNull
	 @NotEmpty
	private boolean galPluviais;
	 @NotNull
	 @NotEmpty
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Benfeitorias other = (Benfeitorias) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Benfeitorias [id=" + id + ", agua=" + agua + ", sarjetas=" + sarjetas + ", esgoto=" + esgoto
				+ ", redeEletrica=" + redeEletrica + ", limpezaUrbana=" + limpezaUrbana + ", iluminacaoPublica="
				+ iluminacaoPublica + ", pavimentacao=" + pavimentacao + ", telefone=" + telefone + ", galPluviais="
				+ galPluviais + ", coletaLixo=" + coletaLixo + "]";
	}
	
}
