<form action="index.php" method="GET">
    <label for="nombre">Nombre</label>
    <input type="text" name="nombre">

    <label for="categoria">Categoría</label>
    <select name="categoria" id="">
        <?php
            foreach (Categoria::cases() as $tipo)
            {
                printf('<option value="%s">%s</option>', $tipo->value, $tipo->label());
            }
        ?>
    </select>

    <fieldset>
        <legend>Ordenar por:</legend>

        <label for="precio">Precio</label>
        <input type="radio" name="orden" id="" value="precio">

        <label for="precio">Nombre</label>
        <input type="radio" name="orden" id="" value="nombre"> 
    </fieldset>

    <button>Buscar</button>
</form>
