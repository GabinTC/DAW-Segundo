<form action="index.php" method="GET">
    <label for="nombre">Nombre</label>
    <input type="text" name="nombre">

    <label for="categoria">Categoría</label>
    <select name="categoria" id="">
        <option value=""></option>
        <?php
            foreach (Categoria::cases() as $tipo)
            {
                printf('<option value="%s">%s</option>', $tipo->value, $tipo->label());
            }
        ?>
    </select>

    <fieldset>
        <legend>Ordenar por precio</legend>

        <label for="precio">Alto-Bajo</label>
        <input type="radio" name="orden" id="" value="masmenos">

        <label for="precio">Bajo-Alto</label>
        <input type="radio" name="orden" id="" value="menosmas"> 
    </fieldset>

    <button>Buscar</button>
</form>
