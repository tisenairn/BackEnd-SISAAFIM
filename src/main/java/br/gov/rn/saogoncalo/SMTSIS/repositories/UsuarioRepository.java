package br.gov.rn.saogoncalo.SMTSIS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.rn.saogoncalo.SMTSIS.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
}
