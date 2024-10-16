package com.example.Examen1DWES.clases;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private String nombre;
    private List<Pelicula> peliculas;

    public Director(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }
}
