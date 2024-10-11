package com.example.demo.repository.Usuarios;

import com.example.demo.clases.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositoryRAM implements UsuarioRepository{

    private ArrayList<Usuario> usuarios;

    public UsuarioRepositoryRAM() {

        this.usuarios = new ArrayList<>();
    }

    @Override
    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    @Override
    public void guardarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
}
