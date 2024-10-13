package com.example.demo.repository;

import com.example.demo.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryRAM implements UsuarioRepository{

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    @Override
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }
}
