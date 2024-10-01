<?php

include "clases/Producto.php";

interface ProductoRepository {

    function saveProducto($Producto);

    function getProductos();

}