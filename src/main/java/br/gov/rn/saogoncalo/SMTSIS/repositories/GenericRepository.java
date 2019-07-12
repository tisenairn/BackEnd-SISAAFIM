package br.gov.rn.saogoncalo.SMTSIS.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import br.gov.rn.saogoncalo.SMTSIS.models.AuditableEntity;


@NoRepositoryBean
public interface GenericRepository<T extends AuditableEntity> extends JpaRepository<T, Long> {

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
	@Query("SELECT entity FROM #{#entityName} entity")
	List<T> findAll();

	@Override
	@Query("SELECT entity FROM #{#entityName} entity WHERE entity.id=:id")
	Optional<T> findById(Long id);
}