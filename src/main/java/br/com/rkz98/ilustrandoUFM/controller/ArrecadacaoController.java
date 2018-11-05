package br.com.rkz98.ilustrandoUFM.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.rkz98.ilustrandoUFM.model.Arrecadacao;
import br.com.rkz98.ilustrandoUFM.model.Fonte;
import br.com.rkz98.ilustrandoUFM.repository.ArrecadacaoRepository;
import br.com.rkz98.ilustrandoUFM.repository.FonteRepository;

@Controller
public class ArrecadacaoController {

	@Autowired
	private ArrecadacaoRepository arrecadacaoRepositorio;
	private FonteRepository fonteRepositorio;

	@RequestMapping(value = "/cadastrarArrecadacao", method = RequestMethod.GET)
	public String formulario() {
		return "Arrecadacao/formularioArrecadacao";
	}

	// @RequestMapping(value = "/cadastrarArrecadacao", method = RequestMethod.GET)
	// public ModelAndView formulario() {
	// ModelAndView modelView = new
	// ModelAndView("Arrecadacao/formularioArrecadacao");
	// Iterable<Fonte> fontes = fonteRepositorio.findAll();
	// modelView.addObject("fontes", fontes);
	// return modelView;
	// }

	@RequestMapping(value = "/cadastrarArrecadacao", method = RequestMethod.POST)
	public String formulario(Arrecadacao arrecadacao) {
		arrecadacaoRepositorio.save(arrecadacao);
		return "redirect:/cadastrarArrecadacao";
	}

	@RequestMapping(value = "/listarArrecadacoes")
	public ModelAndView listar() {
		ModelAndView modelView = new ModelAndView("Arrecadacao/listarArrecadacoes");
		Iterable<Arrecadacao> arrecadacoes = arrecadacaoRepositorio.findAll();
		modelView.addObject("arrecadacoes", arrecadacoes);
		return modelView;
	}

	@RequestMapping(value = "/deletarArrecadacao")
	public String deletar(long id) {
		Arrecadacao arrecadacao = arrecadacaoRepositorio.findById(id);
		arrecadacaoRepositorio.delete(arrecadacao);
		return "redirect:/listarArrecadacoes";
	}
}
