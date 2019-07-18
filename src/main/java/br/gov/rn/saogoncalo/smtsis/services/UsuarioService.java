package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collections;
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

    public Usuario buscarPeloId(Long id){

        if (usuarioRepository.existsById(id)){
          Usuario usuarioEncontrado = usuarioRepository.findById(id).get();
          return usuarioEncontrado;
        }
        return null;
    }


}
