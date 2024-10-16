package com.example.Examen1DWES.clases;

public class Pelicula {

    private String titulo, genero;
    private String nombreDirector;
    private Integer year;

    public Pelicula(String titulo, String genero, Integer year) {
        this.titulo = titulo;
        this.nombreDirector = nombreDirector;
        this.genero = genero;
        this.year = year;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
