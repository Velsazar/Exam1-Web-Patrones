
package com.cinelitas.service;


import com.cinelitas.entity.Peli;
import java.util.List;

public interface IPeliService {
    public List<Peli> getAllPeli();
    public Peli getPeliById (long id);
    public void savePeli(Peli Peli);
    public void delete (long id);
}
