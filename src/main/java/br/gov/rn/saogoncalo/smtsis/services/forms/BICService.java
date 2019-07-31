package br.gov.rn.saogoncalo.smtsis.services.forms;

import br.gov.rn.saogoncalo.smtsis.models.forms.BoletimIncricaoCadastral;
import br.gov.rn.saogoncalo.smtsis.repositories.forms.BICRepository;
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



    public BoletimIncricaoCadastral salvar(BoletimIncricaoCadastral bic){
        return bicRepository.save(bic);
    }

    public Optional<BoletimIncricaoCadastral> inativar(Long id){
        Optional<BoletimIncricaoCadastral> bic = bicRepository.findById(id);
        bic.get().setAtivo(false);
        bicRepository.save(bic.get());
        return bic;
    }

    public List<BoletimIncricaoCadastral> buscarTodos() {
        return bicRepository.findAll();
    }
}
