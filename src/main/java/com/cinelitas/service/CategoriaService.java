
package com.cinelitas.service;



import com.cinelitas.entity.Categoria;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cinelitas.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService {
    
    @Autowired   
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listCountry() {
        return (List<Categoria>)categoriaRepository.findAll();  }   
}
