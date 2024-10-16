CREATE DATABASE TorneoVolley;

USE DATABASE TorneoVolley;

CREATE TABLE grupo {
    id AUTO_INCREMENT NOT NULL,
    nombre varchar(50) NOT NULL,
    CONSTRAINT pk_grupo PRIMARY KEY id,
}

CREATE TABLE equipo {
    id int(9) AUTO_INCREMENT NOT NULL,
    nombre varchar(50) NOT NULL,
    puntos int(2) NOT NULL,
    fk_id_grupo int(9) NOT NULL,
    fk_id_equipo int(9) NOT NULL,
    CONSTRAINT pk_equipo PRIMARY KEY id,
    CONSTRAINT fk_grupo FOREIGN KEY fk_id_grupo REFERENCES grupo(id),
    CONSTRAINT fk_equipo FOREIGN KEY fk_id_equipo REFERENCES equipo(id)
}