let frase = prompt("Dime una frase")
let palabra = prompt("Dime una palabra")

let fraseDescompuesta = frase.split(" ");

alert("La palabra está en la posición " + (fraseDescompuesta.indexOf(palabra) + 1))