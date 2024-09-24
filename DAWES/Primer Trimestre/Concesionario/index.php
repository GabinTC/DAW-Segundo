<!DOCTYPE html>
<html lang="en">

<?php
    include("components/head.php");
?>

<body>
    
<?php

    $matricula = $_GET["matricula"];

    

    include "components/header.php";
    include __DIR__."/repositories/CocheRepositoryRAM.php";

    $cochesRepositoryRAM = new CocheRepositoryRAM();

    $arrayCoches = $cochesRepositoryRAM->getCoches();

    echo "<ul>";

    foreach ($arrayCoches as $coche){

        $coche->toString();

    }

    echo "</ul>";
?>

</body>
</html>