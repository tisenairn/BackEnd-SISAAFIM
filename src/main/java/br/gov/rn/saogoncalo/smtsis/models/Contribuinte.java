package br.gov.rn.saogoncalo.smtsis.models;

import javax.persistence.*;

@Entity
@Table(name = "contibruintes")
public class Contribuinte {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String cpf;
    private String rg;
    private String rgExpedidor;
    private String cnh;


    public Contribuinte(){}
    public Contribuinte(Long id, String nome, String dataNascimento, String telefone, String cpf, String rg, String rgExpedidor, String cnh, String cnpj) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.rgExpedidor = rgExpedidor;
        this.cnh = cnh;
        this.cnpj = cnpj;
    }

    private String cnpj;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgExpedidor() {
        return rgExpedidor;
    }

    public void setRgExpedidor(String rgExpedidor) {
        this.rgExpedidor = rgExpedidor;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        Contribuinte other = (Contribuinte) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contribuinte [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", telefone="
                + telefone + ", cpf=" + cpf + ", rg=" + rg + ", rgExpedidor=" + rgExpedidor + ", cnh=" + cnh + ", cnpj="
                + cnpj + "]";
    }



}
