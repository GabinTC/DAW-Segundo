<?php

class Usuario {

    private $nombre;
    private $correo;
    private $password;

    public function __construct($nombre, $correo, $password)
    {
        $this->nombre = $nombre;
        $this->correo = $correo;
        $this->password = $password;
    
    }

    public function getNombre(){
        return $this->nombre;
    }

    public function getCorreo(){
        return $this->correo;
    }

    public function getPassword(){
        return $this->password;
    }
}