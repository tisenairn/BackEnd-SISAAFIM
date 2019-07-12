package br.gov.rn.saogoncalo.SMTSIS.repositories;

import java.io.Serializable;

public interface PersistableEntity <PK extends Serializable>{

	PK getId();
	void setId(PK id);
}