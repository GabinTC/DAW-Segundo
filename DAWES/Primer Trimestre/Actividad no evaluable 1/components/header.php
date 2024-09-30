


    <form action="index.php" method="GET">
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre">

        <label for="categoria">Categoría</label>
        <select name="categoria" id="">
            <option value="1">Zapatillas</option>
            <option value="2">Camistas</option>
            <option value="3">Sudaderas</option>
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
