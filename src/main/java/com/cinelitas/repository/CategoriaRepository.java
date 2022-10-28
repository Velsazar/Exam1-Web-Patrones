
package com.cinelitas.repository;

import com.cinelitas.entity.Categoria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface CategoriaRepository extends CrudRepository<Categoria,Long>{   
} 