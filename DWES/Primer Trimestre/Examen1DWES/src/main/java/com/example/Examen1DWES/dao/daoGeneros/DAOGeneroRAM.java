package com.example.Examen1DWES.dao.daoGeneros;

import com.example.Examen1DWES.clases.Genero;

import java.util.ArrayList;
import java.util.List;

public class DAOGeneroRAM implements DAOGenero{

    private List<Genero> generos;

    public DAOGeneroRAM() {
        this.generos = new ArrayList<>();

        this.generos.add(new Genero("Animacion"));
        this.generos.add(new Genero("Ciencia ficción") );
        this.generos.add(new Genero("Comedia"));
        this.generos.add(new Genero("Drama"));
        this.generos.add(new Genero("Fantasia"));
        this.generos.add(new Genero("Romance"));
        this.generos.add(new Genero("Terror"));
    }

    @Override
    public List<Genero> getGeneros() {
        return this.generos;
    }
}
