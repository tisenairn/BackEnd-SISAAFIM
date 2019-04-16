package br.sga.rn.gov.smtsis.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.sga.rn.gov.smtsis.models.AuditedEntity;
import br.sga.rn.gov.smtsis.services.GenericService;

public abstract class AbstractController<T extends AuditedEntity> {
	@Autowired
	private GenericService<T> service;

	public abstract Class<T> getClassType();

	@GetMapping
	public String index(Model model) {
		T entity = null;
		try {
			entity = getClassType().getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		List<T> entities = service.obterTodos();

		String entityName = getNomeEntidade();
		String entityList = getNomeEntidadeLista();

		model.addAttribute(entityName, entity);
		model.addAttribute(entityList, entities);
		return this.getNomeEntidade().concat("/index");
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {

		String entityName = getNomeEntidade();
		String entityList = getNomeEntidadeLista();
		List<T> entities = service.obterTodos();
		
		T entity = service.obter(id);
		model.addAttribute(entityName, entity);
		model.addAttribute(entityList, entities);
		return this.getNomeEntidade().concat("/index");
	}

	@PostMapping
	public String salvar(T entity) {
		service.salvar(entity);
		return "redirect:/";
	}


	private String getNomeEntidade() {

		return StringUtils.uncapitalize(getClassType().getSimpleName());
	}

	private String getNomeEntidadeLista() {
		return getClassType().getSimpleName().toLowerCase().concat("Lista");
	}
}
