
package com.cinelitas.controller;

import com.cinelitas.entity.Categoria;
import com.cinelitas.entity.Peli;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.cinelitas.service.ICategoriaService;
import com.cinelitas.service.IPeliService;


@Controller 
public class PeliController {

    @Autowired 
    private IPeliService peliService;

    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/peli")
    public String index(Model model) {
        List<Peli> listaPeli = peliService.getAllPeli();
        model.addAttribute("titulo", "Tabla Pelis");
        model.addAttribute("pelis", listaPeli);
        return "pelis";
    }

    @GetMapping("/pelisN")
    public String crearPeli(Model model) {
        List<Categoria> listacCategorias = categoriaService.listCountry();
        model.addAttribute("peli", new Peli());
        model.addAttribute("categorias", listacCategorias);
        return "crear";  
    }

    @PostMapping("/save") 
    public String guardarPeli(@ModelAttribute Peli peli) {
        peliService.savePeli(peli);
        return "redirect:/peli";
    }

    @GetMapping("/editPeli/{id}")
    public String editarPeli(@PathVariable("id") Long idPeli, Model model) {
        Peli peli = peliService.getPeliById(idPeli);
        List<Categoria> listaCategorias = categoriaService.listCountry();
        model.addAttribute("peli", peli);
        model.addAttribute("categorias", listaCategorias);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPeli(@PathVariable("id") Long idPeli) {
        peliService.delete(idPeli);
        return "redirect:/persona";
    }
    
}
