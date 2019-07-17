package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Endereco;
import br.gov.rn.saogoncalo.smtsis.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public Endereco salvar(Endereco endereco) {
        if (endereco.getId() == null)
            return enderecoRepository.save(endereco);
        return null;
    }

    public Endereco buscarPorId(Long id) {
        if (enderecoExiste(id))
            return  enderecoRepository.findById(id).get();
        return null;
    }

    public Boolean deleta(Long id){
        if (enderecoExiste(id)){
            enderecoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private boolean enderecoExiste(Long id){
        List<Endereco> listaEnderecos = enderecoRepository.findAll();
        for (Endereco endereco: listaEnderecos) {
            if(endereco.getId().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }

    public Endereco atualizar(Endereco endereco) {
        if (endereco.getId() != null){
            if (enderecoExiste(endereco.getId())){
                return enderecoRepository.save(endereco);
            }
        }
        return null;
    }
}
