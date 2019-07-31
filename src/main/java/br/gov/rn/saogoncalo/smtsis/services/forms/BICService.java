package br.gov.rn.saogoncalo.smtsis.services.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.forms.BICRepository;
import br.gov.rn.saogoncalo.smtsis.utils.Datas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BICService {

    @Autowired
    BICRepository bicRepository;

    @Autowired
    Datas datas;

    public BoletimIncricaoCadastral salvar(BoletimIncricaoCadastral bic){
        bic.setAtivo(true);
        bic.setDataAbertura(datas.setDataAtual());

        return bicRepository.save(bic);
    }

    public Optional<BoletimIncricaoCadastral> inativar(Long id){
        Optional<BoletimIncricaoCadastral> bic = bicRepository.findById(id);
        bic.get().setDataFechadura(datas.setDataAtual());
        bic.get().setAtivo(false);
        bicRepository.save(bic.get());
        return bic;
    }

    public List<BoletimIncricaoCadastral> buscarTodos() {
        return bicRepository.findAll();
    }
}
