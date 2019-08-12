package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;


@Entity
@Table(name = "usuarios")
public class Usuario extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;
// TODO Criar um tratamento de exceção para este coluna do tipo Unico
    @NotNull(message = "A matrícula não pode ser nula")
//    @Column(unique = true, columnDefinition = "int(7) ZEROFILL", length = 7)
    private int matricula;
    @JsonIgnore
    @NotEmpty(message = "A senha não estar vazia, nem nula")
    @Size(min = 8, max = 50, message = "Tamanho mínimo, 8, e máximo 50")
    private String senha;
    @NotEmpty(message = "O nome não pode estar vazio, nem nulo")
    @Size(min = 3, max = 50, message = "Tamanho mínimo 3, e máximo 50 chars")
    private String nome;
    @NotNull(message = "O tipo de usuário não pode ser nulo")
    private TipoUsuario tipo;
    @NotEmpty(message = "O telefone não pode estar vazio nem nulo")
    private String telefone;
    @Email(message = "Insira um e-mail válido")
    @NotEmpty(message = "O e-mail não pode estar vazio nem nulo")
    private String email;
    @NotEmpty(message = "O cargo não pode estar vazio nem nulo")
    private String cargo;


    public Usuario(){}

    public Usuario(int matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {

        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
    }
    public Usuario(Long id, int matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {
        this.id = id;
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
    }
    public Usuario(int matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
