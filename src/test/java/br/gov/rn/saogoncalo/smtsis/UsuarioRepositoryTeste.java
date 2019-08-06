package br.gov.rn.saogoncalo.smtsis;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioRepositoryTeste {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void salvarDevePersistirOsDados() {
        Usuario usuario = new Usuario(1L, 123, "123", "Lindson",
                TipoUsuario.FISCAL,"986326467","lindson@gmail.com", "Tecnico");
        this.usuarioRepository.save(usuario);
        assertThat(usuario.getId()).isNotNull();
        assertThat(usuario.getMatricula()).isEqualTo(123);
        assertThat(usuario.getSenha()).isEqualTo("123");
        assertThat(usuario.getNome()).isEqualTo("Lindson");
        assertThat(usuario.getTipo()).isEqualTo(TipoUsuario.FISCAL);
        assertThat(usuario.getTelefone()).isEqualTo("986326467");
        assertThat(usuario.getEmail()).isEqualTo("lindson@gmail.com");
        assertThat(usuario.getCargo()).isEqualTo("Tecnico");
    }

    @Test
    public void removerDeveModificarOsTipoAtivo(){
        Usuario usuario = new Usuario(1L,123, "123", "Lindson",
                TipoUsuario.FISCAL,"986326467","lindson@gmail.com", "Tecnico");
        this.usuarioRepository.save(usuario);
        this.usuarioRepository.delete(usuario);
        // TODO O Ativo ainda está dando como true, ou seja está errado, o set da query do repository deveria setar 0, e retornar false neste caso.
        //        Vou colocar true só para continuar os testes
        assertThat(usuarioRepository.getOne(usuario.getId()).isAtivo()).isEqualTo(false);
    }

    @Test
    public void atualizarDeveModificarEPersistirOsDados(){
        Usuario usuario = new Usuario(1L, 123, "123", "Lindson",
                TipoUsuario.FISCAL,"986326467","lindson@gmail.com", "Tecnico");
        this.usuarioRepository.save(usuario);
        usuario.setNome("Outro Lindson");
        usuario.setCargo("Fui rebaixado a ASG");
        this.usuarioRepository.save(usuario);
        usuario = this.usuarioRepository.getOne(usuario.getId());
        assertThat(usuario.getNome()).isEqualTo("Outro Lindson");
        assertThat(usuario.getCargo()).isEqualTo("Fui rebaixado a ASG");
    }



}