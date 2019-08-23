package br.gov.rn.saogoncalo.smtsis.repositories;

import java.io.Serializable;

public interface PersistableEntity <PK extends Serializable> {

    PK getId();
    void setId(PK id);
}