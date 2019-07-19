package br.gov.rn.saogoncalo.smtsis.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.rn.saogoncalo.smtsis.models.Benfeitorias;
import br.gov.rn.saogoncalo.smtsis.repositories.BenfeitoriasRepository;

@Service
public class BenfeitoriasService {

	@Autowired
	private BenfeitoriasRepository repository;
	
	public Benfeitorias salvar(Benfeitorias benfeitorias) {
         return repository.save(benfeitorias);
    }

	public List<Benfeitorias> BuscarTodos() {
		return repository.findAll();
	}

	public Benfeitorias BuscarPorId(Long id) {
		return repository.findById(id).get();
	}
	
	public Boolean deleta(Long id){
        if (benfeitoriaExiste(id)){
        	repository.deleteById(id);
            return true;
        }
        return false;
    }

    private boolean benfeitoriaExiste(Long id){
        return repository.existsById(id);
    }
	
    public Benfeitorias editar(Benfeitorias benfeitoria) {
        if (benfeitoria.getId() != null){
            if (benfeitoriaExiste(benfeitoria.getId())){
                return repository.save(benfeitoria);
            }
        }
        return null;
    }
}
