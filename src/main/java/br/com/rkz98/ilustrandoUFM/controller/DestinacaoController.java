package br.com.rkz98.ilustrandoUFM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rkz98.ilustrandoUFM.model.Destinacao;
import br.com.rkz98.ilustrandoUFM.repository.DestinacaoRepository;

@Controller
public class DestinacaoController {

	@Autowired
	private DestinacaoRepository destinacaoRepositorio;

	@RequestMapping(value = "/cadastrarDestinacao", method = RequestMethod.GET)
	public String formulario() {
		return "Destinacao/formularioDestinacao";
	}

	// @RequestMapping(value = "/cadastrarArrecadacao", method = RequestMethod.GET)
	// public ModelAndView formulario() {
	// ModelAndView modelView = new
	// ModelAndView("Arrecadacao/formularioArrecadacao");
	// Iterable<Fonte> fontes = fonteRepositorio.findAll();
	// modelView.addObject("fontes", fontes);
	// return modelView;
	// }

	@RequestMapping(value = "/cadastrarDestinacao", method = RequestMethod.POST)
	public String formulario(Destinacao destinacao) {
		destinacaoRepositorio.save(destinacao);
		return "redirect:/cadastrarDestinacao";
	}

	@RequestMapping(value = "/listarDestinacoes")
	public ModelAndView listar() {
		ModelAndView modelView = new ModelAndView("Destinacao/listarDestinacoes");
		Iterable<Destinacao> destinacoes = destinacaoRepositorio.findAll();
		modelView.addObject("destinacoes", destinacoes);
		return modelView;
	}

	@RequestMapping(value = "/deletarDestinacao")
	public String deletar(long id) {
		Destinacao destinacao = destinacaoRepositorio.findById(id);
		destinacaoRepositorio.delete(destinacao);
		return "redirect:/listarDestinacoes";
	}
}
