<?php

include_once "../../clases/Usuario.php";
include_once "UsuarioRepository.php";

class UsuarioRepositoryRAM implements UsuarioRepository {

    private $arrayUsuarios;

    public function __construct()
    {
        $this->arrayUsuarios = [];
    }

    public function guardarUsuario($usuario)
    {
        array_push($usuario);
    }

    public function getUsuarios()
    {
        return $this->arrayUsuarios;
    }
}