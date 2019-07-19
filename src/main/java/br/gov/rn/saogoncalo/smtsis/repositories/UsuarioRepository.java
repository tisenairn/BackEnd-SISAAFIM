package br.gov.rn.saogoncalo.smtsis.repositories;

import br.gov.rn.saogoncalo.smtsis.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

//    Buscar Ativos
    @Query("SELECT u FROM Usuario u WHERE u.ativo = 1")
    List<Usuario> findByAtivo();

//    Buscar Inativos
    @Query("SELECT u FROM Usuario u WHERE u.ativo = 0")
    List<Usuario> findByInativo();

}