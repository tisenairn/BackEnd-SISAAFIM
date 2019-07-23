package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    //@NotNull
    //@NotEmpty
    // TODO Criar um tratamento de exceção para este coluna do tipo Unico
    //    @Column(unique = true, columnDefinition = "int(7) ZEROFILL", length = 7)
    private int matricula;
    //@NotNull
    //@NotEmpty
    private String senha;
    //@NotNull
    //@NotEmpty
//    @Size(min = 3, max = 50)
    private String nome;
    //@NotNull
    //@NotEmpty
    private TipoUsuario tipo;
    //@NotNull
    //@NotEmpty
    private String telefone;
    //@NotNull
    //@NotEmpty
    private String email;
    //@NotNull
    //@NotEmpty
    private String cargo;
    //@NotNull
    //@NotEmpty
    private Boolean ativo;

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", senha=" + senha + ", tipo="
                + tipo + ", telefone=" + telefone + ", email=" + email + ", ativo=" + ativo + "]";
    }

//    Equals and HashCode para matrícula do usuário.
    public boolean matriculaEquals(Object matricula) {
        if (this == matricula) return true;
        if (matricula == null || getClass() != matricula.getClass()) return false;
        Usuario usuario = (Usuario) matricula;
        return Objects.equals(this.matricula, usuario.matricula);
    }

    public int matriculaHashCode() {
        return Objects.hash(matricula);
    }

//    Equals and hashCode do id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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
