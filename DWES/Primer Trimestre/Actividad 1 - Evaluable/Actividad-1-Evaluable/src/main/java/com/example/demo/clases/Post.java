package com.example.demo.clases;

import java.time.LocalDate;

public class Post {

    private String texto;
    private LocalDate fechaPublicacion;
    private String alias;

    public Post(String texto) {
        this.texto = texto;
        this.fechaPublicacion = LocalDate.now();
        this.alias = alias;
    }

    public String getTexto() {
        return texto;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAlias(){
        return this.alias;
    }

    public void setAlias(String alias){
        this.alias = alias;
    }
}
