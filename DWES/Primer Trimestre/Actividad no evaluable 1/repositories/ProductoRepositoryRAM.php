<?php

include 'ProductoRepository.php';
include __DIR__ . '/../clases/Producto.php';

class ProductoRepositoryRAM implements ProductoRepository {

    private $arrayProductos = [];

    public function __construct()
    {
        $this->arrayProductos = [
            new Producto("Jordan", "Descripción del producto 1", Categoria::Zapatillas, 100.00, true),
            new Producto("Pantalones nike", "Descripción del producto 2", Categoria::Pantalones, 80.50, false),
            new Producto("Man U", "Descripción del producto 3", Categoria::Camisetas, 50.99, true),
            new Producto("Nike AIR", "Descripción del producto 4", Categoria::Zapatillas, 299.99, true),
            new Producto("Pantalones adidas", "Descripción del producto 5", Categoria::Pantalones, 25.00, false),
            new Producto("AC Milan", "Descripción del producto 6", Categoria::Camisetas, 120.75, true),
            new Producto("Pantalones Puma", "Descripción del producto 7", Categoria::Pantalones, 150.30, false),
            new Producto("Galatasaray", "Descripción del producto 8", Categoria::Camisetas, 30.50, true),
            new Producto("Bayern Muncih", "Descripción del producto 9", Categoria::Camisetas, 199.99, false),
            new Producto("Pantalones Kipsta", "Descripción del producto 10", Categoria::Pantalones, 45.00, true),
        ];
    }

    public function saveProducto($producto)
    {
        array_push($producto);
    }

    public function getProductos()
    {
        return $this->arrayProductos;
    }

}