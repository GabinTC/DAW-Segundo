class Bus {

    constructor(capacidad, pasajeros = 0, conductor = {nombre, numeroLicencia}){
        this.capacidad = capacidad;
        this.pasajeros = pasajeros;
        this.conductor = conductor;
    }

    subir(nuevosPasajeros){
        this.pasajeros += nuevosPasajeros;
    }

    bajar(pasajerosQuitados) {
        this.pasajeros -= pasajerosQuitados;
    }
}