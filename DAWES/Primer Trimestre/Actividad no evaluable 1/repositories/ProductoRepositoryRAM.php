<?php

class ProductoRepositoryRAM implements ProductoRepository {

    public function __construct(){

    }

    public function saveProducto($Producto)
    {
        array_push($Producto);
    }

}