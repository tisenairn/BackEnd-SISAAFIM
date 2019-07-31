package br.gov.rn.saogoncalo.smtsis.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

@NoRepositoryBean
public interface GenericRepository<T extends AuditedEntity> extends JpaRepository<T, Long> {

    @Override
    @Transactional
    @Modifying
    @Query("UPDATE #{#entityName} entity SET entity.ativo = false WHERE entity=:entity")
    void delete(@Param("entity") T entity);

    @Override
    @Transactional
    @Modifying
    @Query("UPDATE #{#entityName} entity SET entity.ativo = false WHERE entity.id=:id")
    void deleteById(@Param("id")Long id);

    @Override
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.id=:id")
    Optional<T> findById(Long id);

    @Override
    @Query("SELECT entity FROM #{#entityName} entity")
    List<T> findAll();

    //    Buscar Ativos
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = 1")
    List<Usuario> findByAtivo();

    //    Buscar Inativos
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = 0")
    List<Usuario> findByInativo();
}