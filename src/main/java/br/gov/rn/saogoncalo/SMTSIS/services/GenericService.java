package br.gov.rn.saogoncalo.SMTSIS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.gov.rn.saogoncalo.SMTSIS.models.AuditableEntity;
import br.gov.rn.saogoncalo.SMTSIS.repositories.GenericRepository;

public abstract class GenericService<T extends AuditableEntity>{

	@Autowired
	private GenericRepository<T> repository;
	public void salvar(T entity) {
		repository.save(entity);
		
	}
	public void remover(T entity) {
		repository.delete(entity);
	}
	public void remover(Long id) {
		repository.deleteById(id);
	}
	
	public T obter(Long id) {
		T entity = repository.findById(id).get();
		return entity;
	}
	public List<T> obterTodos(){
		return repository.findAll();
	}
}