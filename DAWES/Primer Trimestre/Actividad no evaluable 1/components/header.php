<form action="index.php" method="GET">
    <label for="nombre">Nombre</label>
    <input type="text" name="nombre">

    <label for="categoria">Categoría</label>
    <select name="categoria" id="">
        <option value=""></option>
        <?php
        foreach (Categoria::cases() as $tipo) {
            printf('<option value="%s">%s</option>', $tipo->value, $tipo->label());
        }
        ?>
    </select>

    <label for="precio">Alto-Bajo</label>
    <input type="radio" name="orden" id="" value="masmenos">

    <label for="precio">Bajo-Alto</label>
    <input type="radio" name="orden" id="" value="menosmas">

    <button>Buscar</button>

    <input type="url" value="destacados" name="destacados">

    <a href="../nuevo.php">Nuevo producto</a>
</form>