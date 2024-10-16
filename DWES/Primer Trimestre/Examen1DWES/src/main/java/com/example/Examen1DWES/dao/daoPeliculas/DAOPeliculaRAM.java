package com.example.Examen1DWES.dao.daoPeliculas;

import com.example.Examen1DWES.clases.Pelicula;
import com.example.Examen1DWES.dao.DAOFactory;

import java.util.ArrayList;
import java.util.List;

public class DAOPeliculaRAM implements DAOPelicula {

    List<Pelicula> peliculas;

    public DAOPeliculaRAM() {

        this.peliculas = new ArrayList<>();

        Pelicula pelicula1 = new Pelicula("El Señor de los anillos", "Fantasia", 2001);
        pelicula1.setNombreDirector(DAOFactory.getInstance().getDaoDirector().findByNombre("Francis Ford Coppola").getNombre());
        Pelicula pelicula2 = new Pelicula("La guerra de las galaxias", "Ciencia Ficcion", 1977);
        pelicula2.setNombreDirector(DAOFactory.getInstance().getDaoDirector().findByNombre("George Lucas").getNombre());
        Pelicula pelicula3 = new Pelicula("E.T.", "Ciencia Ficcion", 1982);
        pelicula3.setNombreDirector(DAOFactory.getInstance().getDaoDirector().findByNombre("Steven Spielberg").getNombre());
        Pelicula pelicula4 = new Pelicula("Parque Jurásico", "Ciencia Ficcion", 1993);
        pelicula4.setNombreDirector(DAOFactory.getInstance().getDaoDirector().findByNombre("Steven Spielberg").getNombre());

        this.peliculas.add(pelicula1);
        this.peliculas.add(pelicula2);
        this.peliculas.add(pelicula3);
        this.peliculas.add(pelicula4);

    }

    @Override
    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }

    @Override
    public void guardarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    @Override
    public List<Pelicula> filtrarPelicula(String filtrarTitulo, String filtrarDirector, String filtrarGenero, Integer filtrarYear) {

        List<Pelicula> peliculasFiltradas = new ArrayList<>();

        for (Pelicula pelicula : this.peliculas) {
            boolean nombreValido = filtrarTitulo == null || pelicula.getTitulo().toLowerCase().contains(filtrarTitulo.toLowerCase());
            boolean directorValido = filtrarDirector == null || pelicula.getNombreDirector().equals(filtrarDirector);
            boolean generoValido = filtrarGenero == null || pelicula.getGenero().equals(filtrarGenero);
            boolean yearValido = filtrarYear == null || pelicula.getYear().equals(filtrarYear);

            if (nombreValido && directorValido && generoValido && yearValido){
                peliculasFiltradas.add(pelicula);
            }
        }

        return peliculasFiltradas;

    }
}
