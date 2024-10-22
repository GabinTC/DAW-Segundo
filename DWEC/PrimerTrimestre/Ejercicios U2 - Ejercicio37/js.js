class Cancion {

    constructor(titulo, autor, duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }
}

class Disco {

    constructor(nombre, artista, anioPublicacion, estilo, canciones = []) {
        this.nombre = nombre;
        this.canciones = canciones;
        this.artista = artista;
        this.anioPublicacion = anioPublicacion;
        this.estilo = estilo;
    }

    addCancion(cancion) {
        this.canciones.push(cancion);
    }

    mostrarCanciones() {
        this.canciones.forEach(cancion => {
            document.write("Canción: " + cancion.titulo + ", " + cancion.autor + ", " + cancion.duracion + "<br>")
        });
    }

    borrarCancion(nombreCancion) {
        this.canciones.forEach(cancion => {
            if (cancion.titulo == nombreCancion) {
                this.canciones.splice(this.canciones.indexOf(cancion), 1);
            }
        })
    }
}

const coleccionDiscos = [];

const disco1 = new Disco("disc1", "art1", 1289, "est1")
const disco2 = new Disco("disc2", "art2", 1245, "est2")
const disco3 = new Disco("disc3", "art3", 1363, "est3")
const disco4 = new Disco("disc4", "art4", 1748, "est4")

coleccionDiscos.push(disco1)
coleccionDiscos.push(disco2)
coleccionDiscos.push(disco3)
coleccionDiscos.push(disco4)

let opcion = prompt("¿Que quieres hacer?\n- (1) Crear un disco\n- (2) Añadir canciones a un disco\n- (3) Eliminar un disco por su nombre")

switch (opcion) {
    case "1":

        let nombreDisco = prompt("Nombre del nuevo disco");
        let artistaDisco = prompt("Artista del disco");
        let anioPublicacionDisco = prompt("Año de publicacion del disco");
        let estiloDisco = prompt("Estilo del disco");

        const disco = new Disco(nombreDisco, artistaDisco, anioPublicacionDisco, estiloDisco)

        coleccionDiscos.push(disco);

        let opcionAddCanciones = prompt("¿Quieres añadir alguna cacion al disco?\n- (1) Sí\n- (2) No")

        switch (opcionAddCanciones) {
            case "1":

                let nombreCancion = prompt("Nombre de la cancion")
                let autorCancion = prompt("Autor de la cancion")
                let duracionCancion = prompt("Duracion de la cancion")

                const cancion = new Cancion(nombreCancion, autorCancion, duracionCancion);

                disco.addCancion(cancion);

                break;

            case "2":
                break;

            default:
                break;
        }

        break;
    case "2":

        let nombreDiscoBuscado = prompt("Dime el nombre del disco");

        coleccionDiscos.forEach(disco => {
            if (disco.nombre == nombreDiscoBuscado) {
                let nombreCancion = prompt("Nombre de la cancion")
                let autorCancion = prompt("Autor de la cancion")
                let duracionCancion = prompt("Duracion de la cancion")

                const cancion = new Cancion(nombreCancion, autorCancion, duracionCancion)

                disco.addCancion(cancion);
            }
        });

        break;
    case "3":

        let nombreDiscoAEliminar = prompt("Dime el nombre del disco");

        coleccionDiscos.forEach(disco => {
            if (disco.nombre == nombreDiscoAEliminar) {
                coleccionDiscos.splice(coleccionDiscos.indexOf(disco), 1);
            }
        });

    default:
        break;
}

let opcionLS = prompt("¿Quieres salir guardando los datos en local storage? (s, n)")

switch (opcionLS) {
    case "s":
        localStorage.setItem("Discos", JSON.stringify(coleccionDiscos))
        break;

    case "n":

        break;

    default:
        break;
}

coleccionDiscos.forEach(disco => {
    document.write(disco.nombre + "<br>");
    document.write(disco.mostrarCanciones() + "<br>")
});