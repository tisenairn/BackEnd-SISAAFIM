package br.gov.rn.saogoncalo.smtsis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.gov.rn.saogoncalo.smtsis.models.Benfeitorias;
import br.gov.rn.saogoncalo.smtsis.services.BenfeitoriasService;

@Controller
@RequestMapping("/benfeitorias")
public class BenfeitoriasController {

	@Autowired
	private BenfeitoriasService service;
	
	@GetMapping
	public String index(Model model) {
		model.addAttribute("benfeitoria",new Benfeitorias());
		model.addAttribute("benfeitorias", service.BuscarTodos());
		return "index";
	}
	
	@PostMapping
	public String salvar(Benfeitorias benfeitoria) {
		service.Salvar(benfeitoria);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		model.addAttribute("contato",service.Buscar(id));
		model.addAttribute("contatos", service.BuscarTodos());
		return "index";
	}
	
	@PostMapping("/editar/{id}")
	public String save(@PathVariable Long id, Benfeitorias benfeitoria) {
		service.Salvar(benfeitoria);
		return "redirect:/";
	}
	
	@GetMapping("/remover/{id}")
	public String remover(@PathVariable Long id, Model model) {
		service.removerPorId(id);
		return "redirect:/";
	}
}
