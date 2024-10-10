<!DOCTYPE html>
<html lang="en">
<?php
    include "components/head.php";
?>
<body>

<?php
    include_once "components/header.php";
    include_once "clases/Usuario.php";
    include_once "repository/Usuarios/UsuarioRepositoryRAM.php";

    $nombreNuevoUsuario = $_POST["nombre"];
    $correoNuevoUsuario = $_POST["correo"];
    $passwordNuevoUsuario = $_POST["password"];

    echo "1";

    $usuarioRepositoryRAM = new UsuarioRepositoryRAM();  

    echo "2";

    $usuarioNuevo = new Usuario($nombreNuevoUsuario, $correoNuevoUsuario, $passwordNuevoUsuario);

    echo "3";

    $usuarioRepositoryRAM->guardarUsuario($usuarioNuevo);

    echo "4";

    $usuarios = $usuarioRepositoryRAM->getUsuarios();

    foreach ($usuarios as $usuario) {
        print_r("%s, %s", $usuario->getNombre(), $usuario->getCorreo());
    }

    

?>
    
</body>
</html>