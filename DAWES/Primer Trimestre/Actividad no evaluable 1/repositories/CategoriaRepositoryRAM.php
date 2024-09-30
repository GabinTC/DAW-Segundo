<?php

class CategoriaRepositoryRAM implements CategoriaRepository {

    public function __construct (){
        
    }

    public function saveCategoria($Categoria)
    {
        array_push($Categoria);
    }
}
