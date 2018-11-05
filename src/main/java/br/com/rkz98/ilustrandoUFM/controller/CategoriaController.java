package br.com.rkz98.ilustrandoUFM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rkz98.ilustrandoUFM.model.Categoria;
import br.com.rkz98.ilustrandoUFM.repository.CategoriaRepository;

@Controller
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepositorio;

	@RequestMapping(value = "/cadastrarCategoria", method = RequestMethod.GET)
	public String formulario() {
		return "Categoria/formularioCategoria";
	}

	@RequestMapping(value = "/cadastrarCategoria", method = RequestMethod.POST)
	public String formulario(Categoria categoria) {
		categoriaRepositorio.save(categoria);
		return "redirect:/cadastrarCategoria";
	}

	@RequestMapping(value = "/listarCategorias")
	public ModelAndView listar() {
		ModelAndView modelView = new ModelAndView("Categoria/listarCategorias");
		Iterable<Categoria> categorias = categoriaRepositorio.findAll();
		modelView.addObject("categorias", categorias);
		return modelView;
	}

	@RequestMapping(value = "/deletarCategoria")
	public String deletar(long id) {
		Categoria categoria = categoriaRepositorio.findById(id);
		categoriaRepositorio.delete(categoria);
		return "redirect:/listarCategorias";
	}
}
