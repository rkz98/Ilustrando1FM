package br.com.rkz98.ilustrandoUFM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rkz98.ilustrandoUFM.model.Fonte;
import br.com.rkz98.ilustrandoUFM.repository.FonteRepository;

@Controller
public class FonteController {

	@Autowired
	private FonteRepository fonteRepositorio;

	@RequestMapping(value = "/cadastrarFonte", method = RequestMethod.GET)
	public String formulario() {
		return "Fonte/formularioFonte";
	}

	@RequestMapping(value = "/cadastrarFonte", method = RequestMethod.POST)
	public String formulario(Fonte fonte) {
		fonteRepositorio.save(fonte);
		return "redirect:/cadastrarFonte";
	}

	@RequestMapping(value = "/listarFontes")
	public ModelAndView listar() {
		ModelAndView modelView = new ModelAndView("Fonte/listarFontes");
		Iterable<Fonte> fontes = fonteRepositorio.findAll();
		modelView.addObject("fontes", fontes);
		return modelView;
	}

	@RequestMapping(value = "/deletarFonte")
	public String deletar(long id) {
		Fonte fonte = fonteRepositorio.findById(id);
		fonteRepositorio.delete(fonte);
		return "redirect:/listarFontes";
	}
}
