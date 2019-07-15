package br.gov.rn.saogoncalo.smtsis.models;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String nome;
    private String senha;
    private TipoUsuario tipo;
    private String telefone;
    private String email;
    private String cargo;
    private Boolean ativo;



    public Usuario(){}
    public Usuario(Long id, String matricula, String nome, String senha, TipoUsuario tipo, String telefone, String email, Boolean ativo) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", senha=" + senha + ", tipo="
                + tipo + ", telefone=" + telefone + ", email=" + email + ", ativo=" + ativo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
