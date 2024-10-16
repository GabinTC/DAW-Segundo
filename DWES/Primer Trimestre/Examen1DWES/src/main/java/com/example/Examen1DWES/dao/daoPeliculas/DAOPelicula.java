package com.example.Examen1DWES.dao.daoPeliculas;

import com.example.Examen1DWES.clases.Pelicula;

import java.util.List;

public interface DAOPelicula {

    List<Pelicula> getPeliculas();
    void guardarPelicula(Pelicula pelicula);
    List<Pelicula> filtrarPelicula(String filtrarNombre, String filtrarDirector, String filtrarGenero, Integer filtrarYear);

}
