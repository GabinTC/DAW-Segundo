<?php

include __DIR__."/CocheRepository.php";
include __DIR__ . "/../clases/Coche.php";

class CocheRepositoryRAM implements CocheRepository {

    private $arrayCoches = [];

    public function __construct(){

        $coche1 = new Coche(123,"Opel" , "Corsa", 100000);
        $coche2 = new Coche(456, "Ford", "Focus", 5000);
        $coche3 = new Coche(789, "Citroen", "C15", 25000);

        $this->arrayCoches = [$coche1, $coche2, $coche3];
    }

    public function getCoches(){
        
        return $this->arrayCoches;

    }

    public function saveCoche($nuevoCoche){
        
        if($nuevoCoche instanceof Coche){
            array_push($arrayCoches, $nuevoCoche);
        }
    }

    

}