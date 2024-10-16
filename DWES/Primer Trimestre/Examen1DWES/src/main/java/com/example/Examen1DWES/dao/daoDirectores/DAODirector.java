package com.example.Examen1DWES.dao.daoDirectores;

import com.example.Examen1DWES.clases.Director;

import java.util.List;

public interface DAODirector {

    List<Director> getDirectores();
    Director findByNombre(String nombre);

}
