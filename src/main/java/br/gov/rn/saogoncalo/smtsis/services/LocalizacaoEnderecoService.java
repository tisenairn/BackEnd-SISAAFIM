package br.gov.rn.saogoncalo.smtsis.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LocalizacaoEnderecoService {

//    @Autowired
//    private LocalizacaoEnderecoRepository localizacaoEnderecoRepository;
//
//    @Autowired
//    private EnderecoService enderecoService;
//
//    public LocalizacaoEndereco salvar(LocalizacaoEndereco localizacaoEndereco, Long enderecoId) {
//        ContribuinteEndereco endereco = enderecoService.buscarPorId(enderecoId);
//        if (endereco != null ) {
//            if (buscarPorId(enderecoId) == null) {
//                localizacaoEndereco.setImovelEndereco(endereco);
//                LocalizacaoEndereco localizacaoSalva = localizacaoEnderecoRepository.save(localizacaoEndereco);
//                return localizacaoSalva;
//            }
//        }
//        return null;
//    }
//
//    public List<LocalizacaoEndereco> buscarTodos() {
//        List<LocalizacaoEndereco> locaEndList = localizacaoEnderecoRepository.findAll();
//        return locaEndList.size() > 0 ? locaEndList : null;
//    }
//
//    public LocalizacaoEndereco buscarPorId(Long id) {
//        return locaEnderecoExiste(id) ? localizacaoEnderecoRepository.findById(id).get() : null;
//    }
//
//    private boolean locaEnderecoExiste(Long id){
//        return localizacaoEnderecoRepository.existsById(id);
//    }
//
//    public Boolean deletePorId(Long id) {
//        if (locaEnderecoExiste(id)){
//            localizacaoEnderecoRepository.deleteById(id);
//            return true;
//        }
//        return false;
//    }
//
//    public LocalizacaoEndereco atualizar(Long id, LocalizacaoEndereco localizacaoEndereco) {
//        if (buscarPorId(id) != null) {
//            LocalizacaoEndereco localizacaoEnderecoEncontrado = buscarPorId(id);
//            localizacaoEndereco.setId(localizacaoEnderecoEncontrado.getId());
//            localizacaoEndereco.setImovelEndereco(localizacaoEnderecoEncontrado.getImovelEndereco());
//            localizacaoEnderecoRepository.save(localizacaoEndereco);
//            return localizacaoEndereco;
//        }
//        return null;
//    }
}
