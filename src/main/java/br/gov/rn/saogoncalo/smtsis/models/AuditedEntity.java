package br.gov.rn.saogoncalo.smtsis.models;

import br.gov.rn.saogoncalo.smtsis.repositories.PersistableEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class AuditedEntity implements Comparable<AuditedEntity>, PersistableEntity<Long>{

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

    @Column(name ="data_delecao", nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonIgnore
    private Date dataDelecao;

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

    public Date getDataDelecao() {
        return dataDelecao;
    }

    public void setDataDelecao(Date dataDelecao) {
        this.dataDelecao = dataDelecao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    @PreUpdate
    private void PreUpdate() {
        this.dataModificacao = new Date();
    }

    @PreRemove
    public void PreRemove() {
        this.dataDelecao = new Date();
    }

    public Boolean isAtivo() {
        return ativo;
    }

    @Override
    public int compareTo(AuditedEntity entity) {
        return this.getId().compareTo(entity.getId());
    }

}