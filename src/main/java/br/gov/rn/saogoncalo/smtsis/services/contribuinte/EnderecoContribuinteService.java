package br.gov.rn.saogoncalo.smtsis.services.contribuinte;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rn.saogoncalo.smtsis.models.EnderecoContribuinte;
import br.gov.rn.saogoncalo.smtsis.repositories.EnderecoContribuinteRepository;

@Service
@Transactional
public class EnderecoContribuinteService {

    @Autowired
    private EnderecoContribuinteRepository enderecoRepository;

    public List<EnderecoContribuinte> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public EnderecoContribuinte salvar(EnderecoContribuinte endereco) {
        if (endereco.getId() == null)
            return enderecoRepository.save(endereco);
        return null;
    }

    public EnderecoContribuinte buscarPorId(Long id) {
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
        return enderecoRepository.existsById(id);
    }

    public EnderecoContribuinte atualizar(EnderecoContribuinte endereco) {
        if (endereco.getId() != null){
            if (enderecoExiste(endereco.getId())){
                return enderecoRepository.save(endereco);
            }
        }
        return null;
    }
}
