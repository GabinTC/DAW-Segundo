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

// Pide al usuario que te indique su nombre, apellidos ,  edad y un número del 1 al 10. 
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

