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


    if(str_contains($filtroOrden, "menosmas")) {
       usort($arrayProductos, function($a, $b){
        return $a->getPrecio() <=> $b->getPrecio();
    }); 
    } else if ($filtroOrden == "masmenos") {
        usort($arrayProductos, function($a, $b){
            return $b->getPrecio() <=> $a->getPrecio();
        }); 
    }

    foreach ($arrayProductos as $producto) {
        if ((str_contains(strtolower($producto->getCategoria()), strtolower($filtroCategoria))  || empty($filtroCategoria)) 
            && (str_contains(strtolower($producto->getNombre()) , strtolower($filtroNombre) ) || empty($filtroNombre))
            && $producto) {
            printf("<h1>%s</h1><p>%s</p><p>%s</p>", $producto->getNombre(), $producto->getDescripcion(), $producto->getPrecio());
        } 
    }

    echo "noerror";

    ?>
</body>

</html>


