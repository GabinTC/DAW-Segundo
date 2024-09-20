<?php

    echo "Gabin Tellaeche<br><br>";

    $nombre = "Gabin";
    $edad = 19;
    echo "Hola soy $nombre y tengo $edad años<br><br>";

    $x = 5;
    $y = 2;
    $e = 2;

    $resultado = ($x + $y + $e);

    print ("La suma de los números da $resultado");

    if($resutado >= 10) {

        echo "<p>$resultado</p>";

    } else {

        echo "<p><s>$resultado</s></p>";

    }

    $futbolistas = array("Mesi", "rolando", "robaninhos");

    echo "<ul>";
    
    
    foreach ($futbolistas as $futbolista) {

        echo "<li>$futbolista</li>";

    }

    echo "</ul>";
?>