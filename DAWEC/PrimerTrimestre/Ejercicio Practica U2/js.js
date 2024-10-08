// Enunciado 1: Declara 6 variables a las que asignaremos los siguientes valores. 1357, 135.7, 135e7, 0b1010, 0o1357 y 0x1A57.
// Una vez creadas muestra por consola los valores almacenados y el tipo de dato que nos indica el operador typeof.

/*

let var1 = 1357;
let var2 = 135.7;
let var3 = 135e7;
let var4 = 0b1010;
let var5 = 0o1357;
let var6 = 0x1A57;

let arrayVariables = [var1, var2, var3, var4, var5, var6];

arrayVariables.forEach(variable => {
    
    console.log(variable + ", tipo: " + typeof(variable));

});

*/


// Enunciado 2: Pide al usuario un  número utilizando el método prompt(), guarda ese dato en una variable. 
// OJO guardarlo de manera que sea un tipo  Number no un String. Compruébalo mostrando por 
// consola el tipo de dato guardado  con el operador typeof.

/*

let numero = parseInt(prompt("Dime un número"));

if (isNaN(numero)){

    alert("No es un número");

} else {

    alert("El número es " + numero);
    
}

console.log(typeof(numero));

*/

// Enunciado 3: Pide al usuario que te indique su nombre, apellidos ,  edad y un número del 1 al 10. 
// Almacena cada dato en una variable diferente.  A continuación muestra la siguiente información.
//      Por consola una frase que incluya su nombre , apellidos y la edad.
//      En el documento html incluye con formato h3 la misma información.
//      En un alert muestra la siguiente información “Dentro de número años tendras x años”. 
// Ayuda: usa los backticks para crear un template literal que te permita hacer este ejercicio

/*

let nombreUsuario = prompt("Nombre");
let apellidoUsuario = prompt("Apellido");
let edadUsuario = parseInt(prompt("Edad"));

let calcular = parseInt(12);

if (isNaN(edadUsuario) || isNaN(calcular)) {

    alert("La edad es incorrecta");

} else {

    let edadResultado = calcular + edadUsuario;
    

    alert("Dentro de 12 años tendrás: " + edadResultado)

}

*/


// Enunciado 4: Pide al usuario un string, Muestra en el documento la posición que ocupa la primera “a”

/*

let mensajeUsuario = prompt("Dame una cadena de carácteres");

let posicionPrimeraA = parseInt(mensajeUsuario.indexOf("a")) + 1;

document.write("La posición de la primera A es: " + posicionPrimeraA);

*/

// Enunciado 5: Pide al usuario tres strings, debes sustituir en el primer string la primera ocurrencia del
// segundo string por el contenido del tercer string. ejemplo
// string 1 “Hola caracola”
// string 2 “cara”
// string 3 “era”
// resultado a mostrar con un alert “Hola eracola”.

/*

let string1 = "Hola caracola";
let string2 = "cara";
let string3 = "era";

let mensajeFinal = string1.replace(string2, string3);

alert(mensajeFinal);

*/

// Enunciado 6: Amplía el ejercicio anterior a todas las ocurrencias.

/*

let string1 = prompt("Dame una cadena de carácteres");
let string2 = prompt("Dime que parte quieres cambiar");
let string3 = prompt("Dime por qué lo quieres cambiar");

let mensajeFinal = string1.replace(string2, string3);

alert(mensajeFinal);

*/

// Enunciado 7: Pide dos strings al usuario. Debes mostrar el número de veces que el
// segundo string está incluido en el primero

/*

let cadena = prompt("Dime una cadena de carácteres");
let subCadena = prompt("Dame la cadena que quieres saber cuantas veces se repite");

let contador = 0;
let posicion = cadena.indexOf(subCadena);

while (posicion !== -1)
{
    contador++;

    posicion = cadena.indexOf(subCadena, posicion + 1)
}

document.write(subCadena + " se repite " + contador + " veces<br>");

*/

// Enunciado 8: ¿Cuáles son los resultados de estas expresiones?.
// Anotalo en un comentario antes de ejecutarlo y luego compruébalo mostrándolo por consola.

/*

console.log("" + 1);
console.log("" - 1);
console.log(true + false);
console.log(6 / "3");
console.log("2" * "3");
console.log(4 + 5 + "px");
console.log("$" + 4 + 5);
console.log("4" - 2);
console.log("4px" - 2);
console.log(" -9 " + 5);
console.log(" -9 " - 5);
console.log(null + 1);
console.log(undefined + 1);
console.log(" \t \n" - 2);

*/

// Enunciado 9: Arregla el código del ejemplo para que el resultado sea 3.

/*

let a = parseInt(prompt("¿Primer número?", 1));
let b = parseInt(prompt("¿Primer número?", 2));

alert(a + b);

*/

// Enunciado 10: ¿Cuáles son los valores finales de todas las variables a, b, c y d 
// después del código a continuación?

/*

let a = 1, b = 1;
let c = ++a;
let d = b++;

console.log(a + "\n" + b + "\n" + c + "\n" + d); // a = 2, b = 2, c = 2, d = 1

*/

// Enunciado 11: ¿Cuál será el resultado de las siguientes expresiones?

/*

console.log(5 > 4);                 // true
console.log("apple" > "pinneaple"); // false
console.log("2" > "12");            // false
console.log(undefined == null);     // false
console.log(undefined === null);    // false
console.log(null == "\n0\n");       // false
console.log(null === + "\n0\n");    // false

*/

// Enunciado 12: Usa el operador “?” para escribir un código que nos pida un número
// y nos muestre un mensaje si es mayor o igual que cero y otro mensaje si 
// es menor estricto que cero.

/*

let numero = prompt("Dime un número");

numero >= 0 ? alert("Es mayor que cero") : alert("Es menor que 0");

*/

// Enunciado 13: Crea un programa  utilizando la sentencia if else  que pida al usuario que introduzca una edad
// y muestre el siguiente mensaje en función del número introducido:
// 0-12: Niño
// 13-26: Joven
// 27-65: Adulto
// >65: Jubilado

/*

let edad = parseInt(prompt("Dime tú edad"));

if (edad >= 0 && edad <=12) {
    alert("Niño");    
} else if (edad >= 13 && edad <=26) {
    alert("Joven");
} else if (edad >= 27 && edad <=65) {
    alert("Adulto");
} else if (edad >= 66) {
    alert("Jubilado");
}

*/

// Enunciado 14: Mejora el ejercicio anterior de manera que le pregunte al usuario si quiere introducir otra edad .
// También debe comprobar si es un número mayor que cero y en caso contrario pedir al usuario que lo intente otra vez 
// hasta que sea correcto.

/*

let edad = prompt("Dime tú edad");

if (!(edad > 0)) {

    do {
        edad = prompt("Dime una edad válida");
    }while (!(edad > 0));

}

    if (edad <= 12) {
        alert("Niño");
    } else if (edad >= 13 && edad <= 26) {
        alert("Joven");
    } else if (edad >= 27 && edad <= 65) {
        alert("Adulto");
    } else {
        alert("Jubilado");
    }

*/

// Enunciado 15: Construye un programa que pida   un número del 1 al 10 al usuario, 
// luego muestra por pantalla la tabla de multiplicar de ese número hasta 10. 
// Para ello muestra en líneas diferentes el siguiente mensaje: “ 8 por 1 = 8” y así sucesivamente.
// Suponiendo que el usuario hubiera introducido un 8.

/*


let numero = prompt("Dime un número del 1 al 10");

if (!(numero > 0) || !(numero < 10)) {

    do {
        numero = prompt("Dime un número válido");
    }while (!(numero > 0) || !(numero < 10));

}

document.write("La tabla del " + numero + " es: <br>");

for (let i = 0; i < 11; i++) {

    document.write(numero + " * " + i + " = " + numero * i + "<br>");

}

*/

// Enunciado 16: Crea un programa que sea un “pequeño traductor” de nombres de frutas. A partir de una lista de 5 Frutas en español 
// (“Pera”, “Manzana”,”Piña”,”Fresa”,”Naranja”) el programa pedirá al usuario el nombre de una fruta, en el caso de que corresponda
// al listado le mostrará en un cuadro de diálogo la traducción al Inglés. En el caso de otro texto mostrará “Fruta desconocida”.
// Para este ejercicio debes usar una estructura switch. 

/*

let fruta = prompt("Dime una fruta");

switch (fruta) {
    case 'pera':
        alert("Inglés: pear")
        break;
    case 'manzana':
        alert("Inglés: apple")
        break;
    case 'piña':
        alert("Inglés: pineapple")
        break;
    case 'fresa':
        alert("Inglés: strawberry")
        break;
    case 'naranja':
        alert("Inglés: orange")
        break;
    default:
        alert("No hay traducción")
        break;
}

*/

// Enunciado 17: Mejora el anterior ejercicio de manera que el programa traduzca correctamente a pesar de que la
//  primera letra esté indistintamente en mayúscula o en minúscula. ¿Y si cualquier letra está en mayúscula o minúscula indistintamente?

/*

let fruta = prompt("Dime una fruta");

switch (fruta.toLowerCase()) {
    case 'pera':
        alert("Inglés: pear")
        break;
    case 'manzana':
        alert("Inglés: apple")
        break;
    case 'piña':
        alert("Inglés: pineapple")
        break;
    case 'fresa':
        alert("Inglés: strawberry")
        break;
    case 'naranja':
        alert("Inglés: orange")
        break;
    default:
        alert("No hay traducción")
        break;
}

*/

// Enunciado 20: Escribe tres funciones suma que acepte un número indeterminado de argumentos y devuelva la suma de todos ellos.
// Debes evitar que la función devuelva “undefined” si no se le pasa ningún argumento, en cuyo caso el valor que devuelva tiene que ser 0.
// Debes escribir cada versión de la función  de las tres formas que hemos visto.
//      suma1 , declaración tradicional de una función
//      suma2, función como expresión.
//      suma3, función flecha.

function metodoSuma1 () {
    
}
