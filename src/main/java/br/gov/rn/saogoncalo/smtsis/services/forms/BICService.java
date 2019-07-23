package br.gov.rn.saogoncalo.smtsis.services.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.forms.BICRepository;
import br.gov.rn.saogoncalo.smtsis.utils.Datas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    public BoletimIncricaoCadastral inativar(Long id, BoletimIncricaoCadastral bic){
        bic.setId(id);
        bic.setDataFechadura(datas.setDataAtual());
        bic.setAtivo(false);

        return bicRepository.save(bic);
    }

    public List<BoletimIncricaoCadastral> buscarTodos() {
        return bicRepository.findAll();
    }
}
