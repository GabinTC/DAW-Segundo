package com.example.Examen1DWES.controller;

import com.example.Examen1DWES.clases.Director;
import com.example.Examen1DWES.clases.Genero;
import com.example.Examen1DWES.clases.Pelicula;
import com.example.Examen1DWES.dao.DAOFactory;
import com.example.Examen1DWES.dao.daoGeneros.DAOGenero;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.GenericArrayType;
import java.util.List;

@Controller
public class PeliculaController {

    @GetMapping("/")
    public String index(Model model, String titulo, String director, String genero, Integer year){

        List<Pelicula> peliculasFiltradas = DAOFactory.getInstance().getDaoPelicula().filtrarPelicula(titulo, director, genero, year);
        model.addAttribute("peliculas", peliculasFiltradas);

        model.addAttribute("directores", DAOFactory.getInstance().getDaoDirector().getDirectores());
        model.addAttribute("generos", DAOFactory.getInstance().getDaoGenero().getGeneros());

        return "index";
    }

    @GetMapping("/nueva")
    public String nuevaPelicula (Model model){

        model.addAttribute("generos", DAOFactory.getInstance().getDaoGenero().getGeneros());
        model.addAttribute("directores", DAOFactory.getInstance().getDaoDirector().getDirectores());

        return "nueva_pelicula";
    }

    @PostMapping("/guardar_pelicula")
    public String guardarPost(Model model, String titulo, String director, String genero, Integer year){

        Pelicula pelicula = new Pelicula(titulo, genero, year);
        pelicula.setNombreDirector(director);

        DAOFactory.getInstance().getDaoPelicula().guardarPelicula(pelicula);

        return "redirect:/";
    }
}
