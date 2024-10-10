<?php

include '/Categoria.php';

class Producto {

    private $id;
    private $nombre;
    private $descripcion;
    private $categoria;
    private $precio;
    private $destacado;

    public function __construct($nombre, $descripcion, $categoria, $precio, $destacado)
    {
        $this->nombre = $nombre;
        $this->descripcion = $descripcion;
        $this->categoria = $categoria;
        $this->precio = $precio;
        $this->destacado = $destacado;
    }

    public function getNombre()
    {
        return $this->nombre;
    }

    public function getDescripcion()
    {
        return $this->descripcion;
    }

    public function getCategoria()
    {
        return $this->categoria->label();
    }

    public function getPrecio()
    {
        return $this->precio;
    }

    public function getDestacado()
    {
        return $this->destacado;
    }
}