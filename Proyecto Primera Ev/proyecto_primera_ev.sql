CREATE DATABASE ProyectoPrimeraEv_Gabin;

USE ProyectoPrimeraEv_Gabin;

CREATE TABLE IF NOT EXISTS productos {
    id int AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    apellido varchar (50) NOT NULL,
    nombre_usuario varchar (50) NOT NULL,
    email varchar (75) NOT NULL,
    telefono varchar (9) NOT NULL,
    password text NOT NULL
}