package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
