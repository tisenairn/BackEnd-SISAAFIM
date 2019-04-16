package br.sga.rn.gov.smtsis.repositories;

import java.io.Serializable;

public interface PersistableEntity <PK extends Serializable>{

	PK getId();
	void setId(PK id);
}
