package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
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

        return usuarioRepository.save(usuario);
    }

    public Usuario atualizar(Long id, Usuario usuario){
    //TODO testar esse ID
       Optional<Usuario> optionalUsuario = usuarioRepository.findById(usuario.getId());
        if (optionalUsuario.isPresent()){
            usuario.setId(id);
            return usuarioRepository.save(usuario);
        }
        return null;
    }

    public Boolean remover(Long id){
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario buscarPeloId(Long id){

        if (usuarioRepository.existsById(id)){
          Usuario usuarioEncontrado = usuarioRepository.findById(id).get();
          return usuarioEncontrado;
        }
        return null;
    }


}
