<!DOCTYPE html>
<html lang="en">

<?php
    include "components/head.php";
?>

<body>

<?php
    include "clases/Categoria.php";
    include "components/header.php";

    

    $filtroNombre = $_GET["nombre"];
    $filtroCategoria = $_GET["categoria"];
    $filtroOrden = $_GET["orden"];

    echo "hola";
    
    include "repositories/ProductoRepositoryRAM.php";
    $productoRepositoryRAM = new ProductoRepositoryRAM();
    $productos = $productoRepositoryRAM->getProductos();

    echo "hola2";

?>
   
    
    
</body>
</html>