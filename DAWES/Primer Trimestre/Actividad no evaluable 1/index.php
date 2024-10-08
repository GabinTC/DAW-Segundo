<!DOCTYPE html>
<html lang="en">

<?php
include 'components/head.php';
?>

<body>

    <?php
    include 'clases/Categoria.php';
    include 'components/header.php';
    include 'repositories/ProductoRepositoryRAM.php';

    $productoRepositoryRAM = new ProductoRepositoryRAM();
    $arrayProductos = $productoRepositoryRAM->getProductos();

    $filtroNombre = $_GET["nombre"];
    $filtroCategoria = $_GET["categoria"];
    $filtroOrden = $_GET["orden"];

    $arrayProductosFiltrados = [];

    foreach ($arrayProductos as $producto) {
        if (str_contains(strtolower($producto->getCategoria()), strtolower($filtroCategoria))  || empty($filtroCategoria)) {
            if (str_contains(strtolower($producto->getNombre()) , strtolower($filtroNombre) ) || empty($filtroNombre)) {
                array_push($arrayProductosFiltrados, $producto);
            } 
        } 
    }

    if ($filtroOrden = "masmenos") {
        sort($arrayProductosFiltrados);
    }


    foreach ($arrayProductosFiltrados as $producto) {
        printf("<h1>%s</h1><p>%s</p><p>%s</p>", $producto->getNombre(), $producto->getDescripcion(), $producto->getPrecio());     
    }

    echo $filtroOrden;

    echo "noerror";

    ?>
</body>

</html>


