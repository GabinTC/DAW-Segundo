package com.example.demo.repository;

import com.example.demo.clases.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void guardarUsuario(Usuario usuaio);
    List<Usuario> getUsuarios();
}
