package com.example.PruebaSpring1.clases;

import java.time.LocalDate;

public class Post {

    private String id;
    private String texto;

    public Post(String id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public String getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }
}
