package com.example.Examen1DWES.dao.daoDirectores;

import com.example.Examen1DWES.clases.Director;
import com.example.Examen1DWES.clases.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class DAODirectorRAM implements DAODirector {

    private List<Director> directores;

    public DAODirectorRAM() {

        this.directores = new ArrayList<>();

        directores.add(new Director("Francis Ford Coppola"));
        directores.add(new Director("Chris Columbus"));
        directores.add(new Director("Peter Jackson"));
        directores.add(new Director("George Lucas"));
        directores.add(new Director("Steven Spielberg"));

    }

    @Override
    public List<Director> getDirectores() {
        return this.directores;
    }

    @Override
    public Director findByNombre(String nombre) {

        for (Director director : this.directores){
            if (director.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                return director;
            }
        }
        return null;
    }


}
