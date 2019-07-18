package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import br.gov.rn.saogoncalo.smtsis.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario buscarPeloId(Long id){

        if (usuarioRepository.existsById(id)){
          Usuario usuarioEncontrado = usuarioRepository.findById(id).get();
          return usuarioEncontrado;
        }
        return null;
    }


}
