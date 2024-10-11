package com.example.demo.clases;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class Post {

    private String texto;
    private LocalDate fechaPublicacion;

    Post(String texto, LocalDate fechaPublicacion) {
        this.texto = texto;
        this.fechaPublicacion = fechaPublicacion;
    }

    public Post() {
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
}
