package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.contribuinte.Contribuinte;
import br.gov.rn.saogoncalo.smtsis.models.imovel.Imovel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ContribuinteService extends GenericService<Contribuinte>{ }
