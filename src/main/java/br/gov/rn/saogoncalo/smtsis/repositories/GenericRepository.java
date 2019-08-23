package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.AuditedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
    Optional<T> findById(@Param("id")Long id);

    @Override
    @Query("SELECT entity FROM #{#entityName} entity")
    List<T> findAll();

    //    Buscar com critério de ativos
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = true")
    List<T> findByAtivo();

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = true AND entity.id=:id")
    Optional<T> findAtivoById(@Param("id")Long id);

    //    Buscar Inativos
    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = false")
    List<T> findByInativo();

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.ativo = false AND entity.id=:id")
    Optional<T> findInativoById(@Param("id")Long id);

}