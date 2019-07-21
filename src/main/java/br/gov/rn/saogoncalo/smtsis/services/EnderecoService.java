package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.imovel.ImovelEndereco;
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

    public List<ImovelEndereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public ImovelEndereco salvar(ImovelEndereco imovelEndereco) {
        if (imovelEndereco.getId() == null)
            return enderecoRepository.save(imovelEndereco);
        return null;
    }

    public ImovelEndereco buscarPorId(Long id) {
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
        List<ImovelEndereco> listaImovelEnderecos = enderecoRepository.findAll();
        for (ImovelEndereco imovelEndereco : listaImovelEnderecos) {
            if(imovelEndereco.getId().compareTo(id) == 0){
                return true;
            }
        }
        return false;
    }

    public ImovelEndereco atualizar(ImovelEndereco imovelEndereco) {
        if (imovelEndereco.getId() != null){
            if (enderecoExiste(imovelEndereco.getId())){
                return enderecoRepository.save(imovelEndereco);
            }
        }
        return null;
    }
}
