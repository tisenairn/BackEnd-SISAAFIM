package br.gov.rn.saogoncalo.smtsis;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UsuarioEndpointTeste {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int randomServerPort;

    @MockBean
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MockMvc mockMvc;

//    final String baseUrl = "http://localhost/usuario/";

    final List<Usuario> usuarios = new ArrayList<>();
    Usuario usuario;


    @Before
    public void AlimentarOsTestes(){
        System.out.println("Rodando na porta: "+randomServerPort);

        usuarios.add(new Usuario(1L, 0000124L, "12345678", "Lindson",
                TipoUsuario.FISCAL,"986326467","lindson@gmail.com", "Tecnico"));
        usuarios.add(new Usuario(2L, 0000125L, "88888888", "Lindson França",
                TipoUsuario.SUPERVISOR,"986326467","lindson@gmail.com", "Caba de peia"));

        usuario = new Usuario(3L, 0000126L, "88888888", "Lindson França",
                TipoUsuario.SUPERVISOR,"986326467","lindson@gmail.com", "Caba de peia");
    }

    //    Para rodar os testes é necessário ter informações de usuario com valores reais no banco de dados.
    // para rodar os testes na url: http://localhost/usuario/listar, deve-se rodar a aplicação SmtsisApplication
    @Test
    public void listarUsuariosDeveRetornar200(){
        BDDMockito.when(usuarioRepository.findByAtivo()).thenReturn(usuarios);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/usuario/listar/", String.class);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    public void listarEntidadeVaziaDeveRetornar204(){
        usuarios.removeAll(Collections.singleton(new Usuario()));
        BDDMockito.when(usuarioRepository.findByAtivo()).thenReturn(usuarios);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/usuario/listar/", String.class);
        assertThat(usuarios).size().isEqualTo(0);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(204);
    }

    @Test
    public void listarUmUsuarioDeveRetornar200(){
        BDDMockito.when(usuarioRepository.findAtivoById()).thenReturn(Optional.ofNullable(usuario));
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/usuario/listar/3", String.class);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }


    @Test
    public void listarUmUsuarioInexistenteDeveRetornar404(){
        BDDMockito.when(usuarioRepository.findAtivoById()).thenReturn(Optional.ofNullable(usuario));
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/usuario/listar/5", String.class);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(404);
    }

}
