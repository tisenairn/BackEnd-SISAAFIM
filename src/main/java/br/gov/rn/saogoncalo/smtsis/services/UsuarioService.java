package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        usuario.setAtivo(true);
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario usuario){
//  TODO Precisa ser testado
       Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (optionalUsuario.isPresent()){
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public Boolean remover(Long id, Usuario usuario){
        Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
        if (!optionalUsuario.isPresent()){
            return null;
        } else if (optionalUsuario.isPresent() && optionalUsuario.get().getAtivo()){
            usuario.setId(id);
            usuario.setAtivo(false);
            usuarioRepository.save(usuario);
            return true;
        }
        return false;
    }

    public List<Usuario> buscarTodos(){

        List<Usuario> usuarios = usuarioRepository.findByAtivo();
        return usuarios;
    }

    public List<Usuario> buscarTodosInativos(){
        List<Usuario> usuarios = usuarioRepository.findByInativo();
        return usuarios;
    }

    public Usuario buscarAtivoPeloId(Long id){
        if (buscarAtivo(id) != null)
            return buscarAtivo(id);
        return null;
    }

    public Usuario buscarInativosPeloId(Long id){
        if (buscarInativo(id) != null)
            return buscarInativo(id);
        return null;
    }

//  Verifica o se Id é existente, e em seguida se o usuário está ativo.
    private Usuario buscarAtivo(Long id){
        if (usuarioRepository.existsById(id)){
            Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
            if (usuarioEncontrado.get().getAtivo())
                return usuarioEncontrado.get();
            }
        return null;
    }
    private Usuario buscarInativo(Long id){
        if (usuarioRepository.existsById(id)){
            Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(id);
            if (!usuarioEncontrado.get().getAtivo())
                return usuarioEncontrado.get();
        }
        return null;
    }
}
