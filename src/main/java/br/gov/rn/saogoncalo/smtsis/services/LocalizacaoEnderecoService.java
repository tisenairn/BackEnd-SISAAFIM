package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.Endereco;
import br.gov.rn.saogoncalo.smtsis.models.LocalizacaoEndereco;
import br.gov.rn.saogoncalo.smtsis.repositories.LocalizaoEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class LocalizacaoEnderecoService {

    @Autowired
    private LocalizaoEnderecoRepository localizaoEnderecoRepository;

    @Autowired
    private EnderecoService enderecoService;

    public LocalizacaoEndereco salvar(LocalizacaoEndereco localizacaoEndereco, Long enderecoId) {
        if ( naoExisteLocalizacaoDoEnderecoSalva(enderecoId) ) {
            Endereco endereco = enderecoService.buscarPorId(enderecoId);
            if (Objects.nonNull(endereco)) {
                localizacaoEndereco.setEndereco(endereco);
                return localizaoEnderecoRepository.save(localizacaoEndereco);
            }
        }
        return null;
    }

    public List<LocalizacaoEndereco> buscarTodos() {
        List<LocalizacaoEndereco> locaEndList = localizaoEnderecoRepository.findAll();
        return locaEndList.size() > 0 ? locaEndList : null;
    }

    public LocalizacaoEndereco buscarPorId(Long id) {
        return localizaoEnderecoRepository.findById(id).get();
    }

    private Boolean naoExisteLocalizacaoDoEnderecoSalva(Long id){
        return localizaoEnderecoRepository.findByEnderecoId(id).isEmpty();
    }

    private boolean locaEnderecoExiste(Long id){
        return localizaoEnderecoRepository.existsById(id);
    }

    public Boolean deletePorId(Long id) {
        if (locaEnderecoExiste(id)){
            localizaoEnderecoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public LocalizacaoEndereco atualizar(Long id, LocalizacaoEndereco localizacaoEndereco) {
        if (buscarPorId(id) != null) {
            LocalizacaoEndereco localizacaoEnderecoEncontrado = buscarPorId(id);
            localizacaoEndereco.setId(localizacaoEnderecoEncontrado.getId());
            localizacaoEndereco.setEndereco(localizacaoEnderecoEncontrado.getEndereco());
            localizaoEnderecoRepository.save(localizacaoEndereco);
            return localizacaoEndereco;
        }
        return null;
    }
}
