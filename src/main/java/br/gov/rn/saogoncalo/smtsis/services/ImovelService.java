package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.persistence.PrePersist;
import javax.transaction.Transactional;

@Service
@Transactional
public class ImovelService extends GenericService<Imovel> {
//    @Override
//    public Imovel salvar(Imovel entity) {
//        Long id = entity.getId();
//        associarImovelAoContribuinte(id);
//        return super.salvar(entity);
//    }
//
//    @PrePersist
//    @Query("INSERT INTO imoveis (id_imovel_contribuinte) SELECT imoveis.contribuinte_id FROM imoveis WHERE id=:id")
//    public void associarImovelAoContribuinte(@Param("id")Long id){}
}