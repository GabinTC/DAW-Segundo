package com.example.demo.clases;

import java.time.LocalDate;

public class Post {

    private String texto;
    private LocalDate fechaPublicacion;

    public Post(String texto, LocalDate fechaPublicacion) {
        this.texto = texto;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
}
