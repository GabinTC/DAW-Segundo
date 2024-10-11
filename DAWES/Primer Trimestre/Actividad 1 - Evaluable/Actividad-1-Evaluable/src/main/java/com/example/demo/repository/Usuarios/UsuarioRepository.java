package com.example.demo.repository.Usuarios;

import com.example.demo.clases.Usuario;

import java.util.List;

public interface UsuarioRepository {

    List<Usuario> getUsuarios();
    void guardarUsuario(Usuario usuario);

}
