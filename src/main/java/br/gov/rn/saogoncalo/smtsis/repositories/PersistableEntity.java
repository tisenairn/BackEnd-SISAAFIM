package br.gov.rn.saogoncalo.smtsis.repositories;

import java.io.Serializable;

public interface PersistableEntity <PrimaryKey extends Serializable> {

    PrimaryKey getId();
    void setId(PrimaryKey id);

}