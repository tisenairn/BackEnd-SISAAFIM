package br.gov.rn.saogoncalo.smtsis.services.imovel;

import br.gov.rn.saogoncalo.smtsis.models.imovel.EnderecoImovel;
import br.gov.rn.saogoncalo.smtsis.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EnderecoImovelService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoImovel> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public EnderecoImovel salvar(EnderecoImovel endereco) {
        if (endereco.getId() == null)
            return enderecoRepository.save(endereco);
        return null;
    }

    public EnderecoImovel buscarPorId(Long id) {
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

    public EnderecoImovel atualizar(EnderecoImovel endereco) {
        if (endereco.getId() != null){
            if (enderecoExiste(endereco.getId())){
                return enderecoRepository.save(endereco);
            }
        }
        return null;
    }
}
