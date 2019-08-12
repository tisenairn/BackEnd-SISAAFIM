package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario> {

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.matricula=:matricula")
    Usuario findByMatricula(int matricula);

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.tipo=:tipo")
    List<Usuario> findByTipo(TipoUsuario tipo);
}