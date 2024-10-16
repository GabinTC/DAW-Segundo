package com.example.demo.dao.DAOPost;

import com.example.demo.clases.Post;
import com.example.demo.clases.Usuario;
import com.example.demo.dao.DAOFactory;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DAOPostRAM implements DAOPost {

    List<Post> posts = new ArrayList<>();


    @Override
    public List<Post> getPosts() {
        return this.posts;
    }

    @Override
    public void guardarPost(Post post, Usuario usuario) {

        post.setAlias(usuario.getNombre());
        usuario.addPost(post);
        this.posts.add(post);

    }

    @Override
    public List<Post> filtrarPosts(String filtrarPostTexto, String filtrarPostUsuario, LocalDate filtrarPostFecha, String ordenFecha) {

        List<Post> postsFiltrados = new ArrayList<>();

        for (Post post : this.posts) {
            boolean aliasValido = filtrarPostUsuario == null ||  post.getAlias().toLowerCase().contains(filtrarPostUsuario.toLowerCase());
            boolean textoValido = filtrarPostTexto == null || post.getTexto().toLowerCase().contains(filtrarPostTexto.toLowerCase());
            boolean fechaValida = filtrarPostFecha == null || post.getFechaPublicacion().equals(filtrarPostFecha);

            if (aliasValido && textoValido && fechaValida){
                postsFiltrados.add(post);
            }
        }

        if (ordenFecha == "asc"){
            return postsFiltrados.stream().sorted(Comparator.comparing(Post::getFechaPublicacion)).toList();
        }

        return postsFiltrados.stream().sorted(Comparator.comparing(Post::getFechaPublicacion)).toList().reversed();

    }


}
