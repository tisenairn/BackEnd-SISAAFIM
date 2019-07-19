package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import br.gov.rn.saogoncalo.smtsis.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> buscarTodos(){
        return usuarioService.buscarTodos().size() > 0 ?
                ResponseEntity.ok().body(usuarioService.buscarTodos()) : ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Usuario> buscarPeloId(@PathVariable Long id){
        return usuarioService.buscarAtivoPeloId(id) != null ?
                ResponseEntity.ok().body(usuarioService.buscarAtivoPeloId(id)) : ResponseEntity.notFound().build();
    }

    @GetMapping("/listar/inativo")
    public ResponseEntity<List<Usuario>> buscarTodosInativos(){
        return usuarioService.buscarTodosInativos().size() > 0 ?
                ResponseEntity.ok().body(usuarioService.buscarTodosInativos()) : ResponseEntity.noContent().build();
    }

    @GetMapping("/listar/inativo/{id}")
    public ResponseEntity<Usuario> buscarInativoPeloId(@PathVariable Long id){
        return usuarioService.buscarInativosPeloId(id) != null ?
                ResponseEntity.ok().body(usuarioService.buscarInativosPeloId(id)) : ResponseEntity.notFound().build();
    }

    @PostMapping("/salvar")
    public ResponseEntity<Usuario> salvar(@Valid @RequestBody Usuario usuario, HttpServletResponse resposta){
        Usuario usuarioResposta = usuarioService.salvar(usuario);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
                .buildAndExpand(usuarioResposta.getId()).toUri();
        resposta.setHeader("Local salvo", uri.toASCIIString());

        return ResponseEntity.created(uri).body(usuarioResposta);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Usuario> atualizar(@Valid @PathVariable Long id,
                                             @RequestBody Usuario usuario, HttpServletResponse resposta){
        Usuario usuarioResposta = usuarioService.atualizar(id, usuario);

//            Se a resposta do método atualizar for diferente de nulo, ele vai obter o local, e o objeto criado;
        return usuarioResposta != null ?
                ResponseEntity.ok().body(usuarioResposta) : ResponseEntity.badRequest().build();
    }

    @PutMapping("/remover/{id}")
    public ResponseEntity<Usuario> remover(@PathVariable Long id,
                                           @RequestBody Usuario usuario, HttpServletResponse resposta){

        Boolean usuarioResposta = usuarioService.remover(id, usuario);
        if (usuarioResposta == null){
            return ResponseEntity.notFound().build();
        } else if (usuarioResposta == true) {
            return ResponseEntity.ok().build();
        }

        //        418 I'm a teapot
        //        O servidor recusa a tentativa de coar café num bule de chá.
        return ResponseEntity.status(418).build();
    }


}
