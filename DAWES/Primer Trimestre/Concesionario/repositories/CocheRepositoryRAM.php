<?php

include "repositories/CocheRepository.php";

class CocheRepositoryRAM implements CocheRepository {

    private $arrayCoches;

    public function __constructor(){
        $coche1 = new Coche(123,"Opel" , "Corsa", 100000);
        $coche2 = new Coche(456, "Ford", "Focus", 5000);
        $coche3 = new Coche(789, "Citroen", "C15", 25000);

        $this->arrayCoches = [$coche1, $coche2, $coche3];
    }

    public function getCoches(){
        
        echo "<ul>";

        foreach ($arrayCoches as $coche) {

            echo "<li>Matricula: " . $coche->getMatricula() ."<br>";
            echo "Marca: " . $coche->getMarca() ."<br>";
            echo "Modelo: " . $coche->getModelo() ."<br>";
            echo "Km: " . $coche->getKm() ."</li><br>";

        }

        echo "</ul>";

    }

    public function saveCoche($nuevoCoche){
        
        if($nuevoCoche instanceof Coche){
            array_push($arrayCoches[$nuevoCoche]);
        }
    }

}