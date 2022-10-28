
package com.cinelitas.repository;

import com.cinelitas.entity.Peli;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeliRepository extends CrudRepository<Peli,Long>{
    
}
