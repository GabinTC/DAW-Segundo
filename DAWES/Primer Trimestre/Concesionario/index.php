<!DOCTYPE html>
<html lang="en">

<?php
    include("components/head.php");
?>

<body>
    
<?php
    include("components/header.php");

    include("clases/Coche.php");
    include("repositories/CocheRepositoryRAM.php");
    getCoches();
?>

</body>
</html>