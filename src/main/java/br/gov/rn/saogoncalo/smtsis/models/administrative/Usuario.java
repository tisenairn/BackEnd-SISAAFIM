package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;


@Entity
@Table(name = "usuarios")
public class Usuario extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;
// TODO Criar um tratamento de exceção para este coluna do tipo Unico, atualmente retornando 500
//    Em produção, anotar definição da coluna matricula com zerofill, padrão da PMSGA
    @NotNull
    @Column(columnDefinition = "INT(7)", length = 7, unique = true)
    private Long matricula;
    @NotEmpty
    @Size(min = 8, max = 50)
    private String senha;
    @NotEmpty
    @Size(min = 3, max = 50)
    private String nome;
    @NotNull
    private TipoUsuario tipo;
    @NotEmpty
    private String telefone;
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    private String cargo;


    public Usuario(){}

    public Usuario(Long matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {

        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
    }
    public Usuario(Long id, Long matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {
        this.id = id;
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
    }



    @Override
    public String toString() {
        return "Usuario{" +
                ", matricula=" + matricula +
                ", senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", tipo=" + tipo +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

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

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
