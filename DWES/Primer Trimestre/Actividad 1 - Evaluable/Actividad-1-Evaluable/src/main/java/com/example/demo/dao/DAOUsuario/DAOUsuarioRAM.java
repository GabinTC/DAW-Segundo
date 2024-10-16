package com.example.demo.dao.DAOUsuario;

import com.example.demo.clases.Usuario;
import com.example.demo.controller.UsuarioController;

import java.util.ArrayList;
import java.util.List;

public class DAOUsuarioRAM implements DAOUsuario {

    List<Usuario> usuarios;

    public DAOUsuarioRAM() {
        this.usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Juan Perez", "juan.perez@example.com", "password123"));
        usuarios.add(new Usuario("Maria Gomez", "maria.gomez@example.com", "password123"));
        usuarios.add(new Usuario("Luis Garcia", "luis.garcia@example.com", "password123"));
        usuarios.add(new Usuario("Ana Lopez", "ana.lopez@example.com", "password123"));
        usuarios.add(new Usuario("Carlos Martinez", "carlos.martinez@example.com", "password123"));
        usuarios.add(new Usuario("Sofia Sanchez", "sofia.sanchez@example.com", "password123"));
        usuarios.add(new Usuario("Jorge Ramirez", "jorge.ramirez@example.com", "password123"));
        usuarios.add(new Usuario("Laura Diaz", "laura.diaz@example.com", "password123"));
        usuarios.add(new Usuario("Fernando Torres", "fernando.torres@example.com", "password123"));
        usuarios.add(new Usuario("Carmen Ruiz", "carmen.ruiz@example.com", "password123"));
    }

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
            if (usuario.getNombre().toLowerCase().equals(nombre.toLowerCase())){
                return usuario;
            }
        }
        return null;
    }
}
