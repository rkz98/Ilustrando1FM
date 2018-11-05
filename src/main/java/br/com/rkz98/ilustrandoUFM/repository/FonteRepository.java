package br.com.rkz98.ilustrandoUFM.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rkz98.ilustrandoUFM.model.Fonte;

public interface FonteRepository extends CrudRepository<Fonte, Long>{
	Fonte findById(long id);
}
