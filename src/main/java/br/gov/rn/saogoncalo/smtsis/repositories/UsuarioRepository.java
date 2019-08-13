package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.enums.TipoUsuario;
import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario> {

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.matricula=:matricula")
    Usuario findByMatricula(Long matricula);

    @Query("SELECT entity FROM #{#entityName} entity WHERE entity.tipo=:tipo")
    List<Usuario> findByTipo(TipoUsuario tipo);
}