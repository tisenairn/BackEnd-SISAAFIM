package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import br.gov.rn.saogoncalo.smtsis.repositories.GenericRepository;
import org.dom4j.tree.AbstractEntity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Optional;

public abstract class GenericService<T extends AuditedEntity>{

    @Autowired
    private GenericRepository<T> repository;

    public T salvar(T entity) {
        return repository.save(entity);
    }

    public T atualizar(Long id, T entity){
    Optional<T> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent() && optionalEntity.get().isAtivo()){
            entity.setId(id);
            return repository.save(entity);
        }
        return null;
    }

    public boolean remover(T entity) {
        Optional<T> optionalEntity = repository.findById(entity.getId());
        if (optionalEntity.isPresent() && optionalEntity.get().getAtivo()){
            optionalEntity.get().PreRemove();
            repository.delete(entity);
            return true;
        }
        return false;
    }

    public boolean removerPeloId(Long id) {
        Optional<T> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent() && optionalEntity.get().getAtivo()){
            optionalEntity.get().PreRemove();
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<T> buscarTodos(){
        List<T> entities = repository.findByAtivo();
        return entities;
    }

    public List<T> buscarTodosInativos(){
        List<T> entities = repository.findByInativo();
        return entities;
    }

    public T buscarPeloId(Long id) {
        T entity = repository.findById(id).get();
        return entity;
    }

    public T buscarAtivoPeloId(Long id){
        if (buscarAtivo(id) != null)
            return buscarAtivo(id);
        return null;
    }

    public T buscarInativoPeloId(Long id){
        if (buscarInativo(id) != null)
            return buscarInativo(id);
        return null;
    }


//     Validações de busca
//  Verifica o se Id é existente, e em seguida se o usuário está ativo.
    private T buscarAtivo(Long id){
        if (repository.existsById(id)){
            Optional<T> entityEncontrada = repository.findAtivoById(id);
            if (entityEncontrada.get().getAtivo())
                return entityEncontrada.get();
        }
        return null;
    }

    private T buscarInativo(Long id){
        if (repository.existsById(id)){
            Optional<T> entityEncontrada = repository.findInativoById(id);
            if (!entityEncontrada.get().getAtivo())
                return entityEncontrada.get();
        }
        return null;
    }

}