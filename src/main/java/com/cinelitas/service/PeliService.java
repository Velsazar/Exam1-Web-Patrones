
package com.cinelitas.service;


import com.cinelitas.entity.Peli;
import com.cinelitas.repository.PeliRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service      
public class PeliService implements IPeliService{

    @Autowired  //para utilizar el persona reposiory
    private PeliRepository peliRepository;
    //Aqui ocupamos el Persona repository para obtener la info requerida en los metodos que vayamos a usar 

    @Override
    public void delete(long id) { 
        peliRepository.deleteById(id);
    }    

    @Override
    public List<Peli> getAllPeli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Peli getPeliById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void savePeli(Peli Peli) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}