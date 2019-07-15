package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscarPeloId(Long id){
        if (ContemUsuario(id)){
          Usuario usuarioEncontrado = usuarioRepository.findById(id).get();
          return usuarioEncontrado;
        }
        return null;
    }

    private Boolean ContemUsuario(Long id){

        List<Usuario> listaUsuario = usuarioRepository.findAll();
        for (Usuario usuario: listaUsuario){
            if (usuario.getId().equals(id)){
                 return true;
            }
        }
        return false;
    }

}
