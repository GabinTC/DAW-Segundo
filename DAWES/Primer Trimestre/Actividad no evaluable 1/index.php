<!DOCTYPE html>
<html lang="en">

<?php
    include "components/head.php";
?>

<body>

<?php
    include "clases/Categoria.php";
?>

<form action="index.php" method="GET">
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre">

        <label for="categoria">Categoría</label>
        <select name="categoria" id="">
            
        </select>

        <fieldset>
            <legend>Ordenar por:</legend>

            <label for="precio">Precio</label>
            <input type="radio" name="orden" id="" value="precio">

            <label for="precio">Categoría</label>
            <input type="radio" name="orden" id="" value="categoria">

            <label for="precio">Nombre</label>
            <input type="radio" name="orden" id="" value="nombre"> 
        </fieldset>

        <button>Buscar</button>
    </form>
    
</body>
</html>