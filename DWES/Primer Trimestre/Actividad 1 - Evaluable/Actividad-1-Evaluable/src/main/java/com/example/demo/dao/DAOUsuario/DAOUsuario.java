package com.example.demo.dao.DAOUsuario;

import com.example.demo.clases.Usuario;

import java.util.List;

public interface DAOUsuario {
    void guardarUsuario(Usuario usuaio);
    List<Usuario> getUsuarios();
    Usuario findByNombre(String nombre);
}
