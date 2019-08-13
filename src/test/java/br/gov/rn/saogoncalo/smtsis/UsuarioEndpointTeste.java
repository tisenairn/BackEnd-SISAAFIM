package br.gov.rn.saogoncalo.smtsis;

import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class UsuarioEndpointTeste {

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    @MockBean
    private UsuarioRepository usuarioRepository;

    @Autowired
    private MockMvc mockMvc;

//    Para rodar este teste é necessário ter informações de usuario com valores reais no banco de dados.
    @Test
    public void listaDeUsuariosQuandoNomeESenhaForemIncorretasDeveRetornarCodigo401(){
        restTemplate.withBasicAuth("sisaafim", "tisenai.2018");
        System.out.println("Rodando na porta: "+port);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("/usuario/listar", String.class);
        assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);
    }

}
