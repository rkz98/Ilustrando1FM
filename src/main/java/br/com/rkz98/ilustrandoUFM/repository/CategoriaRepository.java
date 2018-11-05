package br.com.rkz98.ilustrandoUFM.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rkz98.ilustrandoUFM.model.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Long>{
	Categoria findById(long id);
}
