package br.gov.rn.saogoncalo.smtsis.services.contribuinte;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.gov.rn.saogoncalo.smtsis.models.EnderecoContribuinte;
import br.gov.rn.saogoncalo.smtsis.models.LocalizacaoEnderecoContribuinte;
import br.gov.rn.saogoncalo.smtsis.repositories.LocalizaoEnderecoContribuinteRepository;

@Service
@Transactional
public class LocalizacaoEnderecoContribuinteService {

    @Autowired
    private LocalizaoEnderecoContribuinteRepository localizaoEnderecoRepository;

    @Autowired
    private EnderecoContribuinteService enderecoService;

    public LocalizacaoEnderecoContribuinte salvar(LocalizacaoEnderecoContribuinte localizacaoEndereco, Long enderecoId) {
        if ( naoExisteLocalizacaoDoEnderecoSalva(enderecoId) ) {
        	EnderecoContribuinte endereco = enderecoService.buscarPorId(enderecoId);
            if (Objects.nonNull(endereco)) {
                localizacaoEndereco.setEndereco(endereco);
                return localizaoEnderecoRepository.save(localizacaoEndereco);
            }
        }
        return null;
    }

    public List<LocalizacaoEnderecoContribuinte> buscarTodos() {
        List<LocalizacaoEnderecoContribuinte> locaEndList = localizaoEnderecoRepository.findAll();
        return locaEndList.size() > 0 ? locaEndList : null;
    }

    public LocalizacaoEnderecoContribuinte buscarPorId(Long id) {
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

    public LocalizacaoEnderecoContribuinte atualizar(Long id, LocalizacaoEnderecoContribuinte localizacaoEndereco) {
        if (buscarPorId(id) != null) {
        	LocalizacaoEnderecoContribuinte localizacaoEnderecoEncontrado = buscarPorId(id);
            localizacaoEndereco.setId(localizacaoEnderecoEncontrado.getId());
            localizacaoEndereco.setEndereco(localizacaoEnderecoEncontrado.getEndereco());
            localizaoEnderecoRepository.save(localizacaoEndereco);
            return localizacaoEndereco;
        }
        return null;
    }
}
