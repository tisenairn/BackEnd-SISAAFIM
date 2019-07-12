package br.gov.rn.saogoncalo.SMTSIS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.rn.saogoncalo.SMTSIS.models.Imovel;


@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {
	
	
}