<?php

include 'ProductoRepository.php';
include __DIR__ . '/../clases/Producto.php';

class ProductoRepositoryRAM implements ProductoRepository {

    private $arrayProductos = [];

    public function __construct()
    {
        $this->arrayProductos = [
            new Producto("Producto 1", "Descripción del producto 1", Categoria::Zapatillas, 100.00, true),
            new Producto("Producto 2", "Descripción del producto 2", Categoria::Pantalones, 80.50, false),
            new Producto("Producto 3", "Descripción del producto 3", Categoria::Camisetas, 50.99, true),
            new Producto("Producto 4", "Descripción del producto 4", Categoria::Zapatillas, 299.99, true),
            new Producto("Producto 5", "Descripción del producto 5", Categoria::Pantalones, 25.00, false),
            new Producto("Producto 6", "Descripción del producto 6", Categoria::Camisetas, 120.75, true),
            new Producto("Producto 7", "Descripción del producto 7", Categoria::Pantalones, 150.30, false),
            new Producto("Producto 8", "Descripción del producto 8", Categoria::Camisetas, 30.50, true),
            new Producto("Producto 9", "Descripción del producto 9", Categoria::Camisetas, 199.99, false),
            new Producto("Producto 10", "Descripción del producto 10", Categoria::Pantalones, 45.00, true),
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