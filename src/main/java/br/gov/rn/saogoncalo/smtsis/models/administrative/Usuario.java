package br.gov.rn.saogoncalo.smtsis.models.administrative;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
@Data @AllArgsConstructor @NoArgsConstructor
public class Usuario extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;

    //@NotEmpty
    // TODO Criar um tratamento de exceção para este coluna do tipo Unico
    //    @Column(unique = true, columnDefinition = "int(7) ZEROFILL", length = 7)
    private int matricula;

    //@NotEmpty
    private String senha;

    //@NotEmpty
//    @Size(min = 3, max = 50)
    private String nome;

    //@NotEmpty
    private TipoUsuario tipo;

    //@NotEmpty
    private String telefone;

    //@NotEmpty
    private String email;

    //@NotEmpty
    private String cargo;

    public Usuario(int matricula, String senha, String nome, TipoUsuario tipo, String telefone, String email, String cargo) {
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.cargo = cargo;
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
        return null;
    }

    @Override
    public void setId(Long id) {

    }

}
