package br.com.rkz98.ilustrandoUFM.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rkz98.ilustrandoUFM.model.Arrecadacao;

public interface ArrecadacaoRepository extends CrudRepository<Arrecadacao, Long>{
	Arrecadacao findById(long id);
}
