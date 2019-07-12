package br.gov.rn.saogoncalo.SMTSIS.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.gov.rn.saogoncalo.SMTSIS.repositories.PersistableEntity;

@MappedSuperclass
public abstract class AuditableEntity implements Comparable<AuditableEntity>, PersistableEntity<Long>{

	@CreatedDate
	@Column(name = "data_criacao", nullable = false, updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonIgnore
	//JsonIgnore usado para ocultar no cabeçalho get do protocolo http
	private Date dataCriacao = new Date();
	
	
	@LastModifiedDate
	@Column(name ="data_modificacao", nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonIgnore
	private Date dataModificacao;
	@Column(name = "ativo", nullable = false)
	@JsonIgnore
	private Boolean ativo = true;
	@JsonIgnore
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}
	//Usado para atualizar a data toda vez que alterado
	@PreUpdate
	private void PreUpdate() {
		this.dataModificacao = new Date();
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Boolean isAtivo() {
		return ativo;
	}

	@Override
	public int compareTo(AuditableEntity entity) {
		
		return this.getId().compareTo(entity.getId());
	}
	
}