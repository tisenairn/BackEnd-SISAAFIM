package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import br.gov.rn.saogoncalo.smtsis.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class UsuarioResource {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarPeloId(@PathVariable Long id){

        if (Optional.ofNullable(usuarioService.buscarPeloId(id)).isPresent()){
            Usuario usuario = usuarioService.buscarPeloId(id);
            return ResponseEntity.ok().body(usuario);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/usuario")
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario, HttpServletResponse resposta){

        Usuario usuarioResposta = usuarioRepository.save(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(usuarioResposta.getId()).toUri();
        resposta.setHeader("Location", uri.toASCIIString());

        return ResponseEntity.created(uri).body(usuarioResposta);
    }

}
