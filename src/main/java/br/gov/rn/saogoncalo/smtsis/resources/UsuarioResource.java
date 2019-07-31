package br.gov.rn.saogoncalo.smtsis.resources;

import br.gov.rn.saogoncalo.smtsis.models.administrative.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioResource extends GenericResourceController<Usuario>{ }
