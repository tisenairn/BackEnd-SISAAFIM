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
	
	public void Salvar(Benfeitorias benfeitoria) {
		repository.save(benfeitoria);
	}

	public List<Benfeitorias> BuscarTodos() {
		return repository.findAll();
	}

	public Benfeitorias Buscar(Long id) {
		return repository.findById(id).get();
	}

	public void remover(Benfeitorias benfeitoria) {
		repository.delete(benfeitoria);
	}

	public void removerPorId(Long id) {
		repository.deleteById(id);
	}
	
}
