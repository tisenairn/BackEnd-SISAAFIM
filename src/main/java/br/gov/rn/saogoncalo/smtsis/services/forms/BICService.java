package br.gov.rn.saogoncalo.smtsis.services.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.forms.BICRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BICService {

    @Autowired
    BICRepository BICRepository;

    public BoletimIncricaoCadastral salvar(BoletimIncricaoCadastral bic){
        bic.setAtivo(true);
//        bic.setContribuinte(contribuinte);
//        bic.setImovel(imovel);
        return BICRepository.save(bic);
    }

    public List<BoletimIncricaoCadastral> buscarTodos() {
        return BICRepository.findAll();
    }
}
