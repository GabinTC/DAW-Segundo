<?php

enum Categoria : string {

    case Zapatillas = 'Zapatillas';
    case Camisetas = 'Camisetas';
    case Pantalones = 'Pantalones';

    public function label(): string
    {
        return match($this) {
            static::Zapatillas => 'Zapatillas',
            static::Camisetas => 'Camisetas',
            static::Pantalones => 'Pantalones',
        };
    }
}


