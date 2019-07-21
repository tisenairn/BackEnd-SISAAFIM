package br.gov.rn.saogoncalo.smtsis.services.imovel;

import br.gov.rn.saogoncalo.smtsis.models.imovel.EnderecoImovel;
import br.gov.rn.saogoncalo.smtsis.models.imovel.LocalizacaoEnderecoImovel;
import br.gov.rn.saogoncalo.smtsis.repositories.LocalizaoEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

@Service
@Transactional
public class LocalizacaoEnderecoImovelService {

    @Autowired
    private LocalizaoEnderecoRepository localizaoEnderecoRepository;

    @Autowired
    private EnderecoImovelService enderecoService;

    public LocalizacaoEnderecoImovel salvar(LocalizacaoEnderecoImovel localizacaoEndereco, Long enderecoId) {
        if ( naoExisteLocalizacaoDoEnderecoSalva(enderecoId) ) {
        	EnderecoImovel endereco = enderecoService.buscarPorId(enderecoId);
            if (Objects.nonNull(endereco)) {
                localizacaoEndereco.setEndereco(endereco);
                return localizaoEnderecoRepository.save(localizacaoEndereco);
            }
        }
        return null;
    }

    public List<LocalizacaoEnderecoImovel> buscarTodos() {
        List<LocalizacaoEnderecoImovel> locaEndList = localizaoEnderecoRepository.findAll();
        return locaEndList.size() > 0 ? locaEndList : null;
    }

    public LocalizacaoEnderecoImovel buscarPorId(Long id) {
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

    public LocalizacaoEnderecoImovel atualizar(Long id, LocalizacaoEnderecoImovel localizacaoEndereco) {
        if (buscarPorId(id) != null) {
        	LocalizacaoEnderecoImovel localizacaoEnderecoEncontrado = buscarPorId(id);
            localizacaoEndereco.setId(localizacaoEnderecoEncontrado.getId());
            localizacaoEndereco.setEndereco(localizacaoEnderecoEncontrado.getEndereco());
            localizaoEnderecoRepository.save(localizacaoEndereco);
            return localizacaoEndereco;
        }
        return null;
    }
}
