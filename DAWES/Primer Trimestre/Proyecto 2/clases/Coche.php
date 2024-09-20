<?php

    class Coche {

        private $marticula;
        private $marca;
        private $modelo;
        private $km;

        public function __construct($marticula, $marca, $modelo, $km) {

            $this->$marticula = $marticula;
            $this->$marca = $marca;
            $this->$modelo = $modelo;
            $this->$km = $km;

        }

        public function getMatricula() {

            return $this->$marticula;

        }

        public function getMarca() {

            return $this->$marca;
            
        }

        public function getModelo() {

            return $this->$modelo;
            
        }

        public function getkm() {

            return $this->$km;
            
        }
    }