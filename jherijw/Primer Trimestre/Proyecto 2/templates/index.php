<!DOCTYPE html>

<html>

    <?php
        include "templates/head.php";
    ?>
    
    <body>
        <?php 
            include "templates/header.php";

            $coche1 = new Coche("123", "Opel", "Corsa", "100000");
            $coche2 = new Coche("456", "Renault", "Megane", "5000");
            $coche3 = new Coche("789", "Nissan", "Qasqai", "25000");
            $coches = array($coche1, $coche2, $coche3);

            echo "<ul>";

            foreach ($coches as $coche) {
                print_r($coche);

                echo "<li>Matricula: " . $coche->getMatricula() . "</li>";
                echo "<li>Marca: " . $coche->getMarca() . "</li>";
                echo "<li>Modelo: " . $coche->getModelo() . "</li>";
                echo "<li>Km: " . $coche->getKm() . "</li>";
                echo "<br>";
            }
            echo "</ul>";
        ?>  
    </body>
</html>