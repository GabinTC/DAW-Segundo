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



let string1 = prompt("Dime una cadena de carácteres");
let string2 = prompt("Dame la cadena que quieres saber cuantas veces se repite");



