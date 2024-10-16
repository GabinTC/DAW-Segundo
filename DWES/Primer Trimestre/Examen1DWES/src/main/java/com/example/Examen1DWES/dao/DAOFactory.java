package com.example.Examen1DWES.dao;

import com.example.Examen1DWES.dao.daoDirectores.DAODirector;
import com.example.Examen1DWES.dao.daoDirectores.DAODirectorRAM;
import com.example.Examen1DWES.dao.daoGeneros.DAOGenero;
import com.example.Examen1DWES.dao.daoGeneros.DAOGeneroRAM;
import com.example.Examen1DWES.dao.daoPeliculas.DAOPelicula;
import com.example.Examen1DWES.dao.daoPeliculas.DAOPeliculaRAM;

public class DAOFactory {

    private static DAOFactory instance;
    private DAOPelicula daoPelicula;
    private DAODirector daoDirector;
    private DAOGenero daoGenero;

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if(DAOFactory.instance == null){
            DAOFactory.instance = new DAOFactory();
        }
        return instance;
    }

    public DAOPelicula getDaoPelicula() {
        if(this.daoPelicula == null){
            this.daoPelicula = new DAOPeliculaRAM();
        }
        return this.daoPelicula;
    }

    public DAODirector getDaoDirector() {
        if(this.daoDirector == null){
            this.daoDirector = new DAODirectorRAM();
        }
        return this.daoDirector;
    }

    public DAOGenero getDaoGenero() {
        if(this.daoGenero == null){
            this.daoGenero = new DAOGeneroRAM();
        }
        return this.daoGenero;
    }
}