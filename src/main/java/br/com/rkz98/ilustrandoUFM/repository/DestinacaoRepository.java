package br.com.rkz98.ilustrandoUFM.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rkz98.ilustrandoUFM.model.Destinacao;

public interface DestinacaoRepository extends CrudRepository<Destinacao, Long>{
	Destinacao findById(long id);
}
