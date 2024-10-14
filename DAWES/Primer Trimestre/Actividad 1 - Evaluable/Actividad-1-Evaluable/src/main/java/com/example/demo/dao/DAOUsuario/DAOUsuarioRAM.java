package com.example.demo.dao.DAOUsuario;

import com.example.demo.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class DAOUsuarioRAM implements DAOUsuario {

    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }
    @Override
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    @Override
    public Usuario findByNombre(String nombre){
        for (Usuario usuario : this.usuarios){
            if (usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }
}
