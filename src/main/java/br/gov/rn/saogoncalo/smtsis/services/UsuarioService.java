package br.gov.rn.saogoncalo.smtsis.services;

import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UsuarioService extends GenericService<Usuario>{}