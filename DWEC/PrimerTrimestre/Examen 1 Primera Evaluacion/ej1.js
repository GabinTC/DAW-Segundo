let limiteInferior = parseInt(prompt("Pasame el límite inferior"));
let limiteSuperior = parseInt(prompt("Pasame el límite superior"));

let numeroAAdivinar = parseInt(Math.random() * (limiteSuperior - limiteInferior) + limiteInferior)

let numeroIntentado;
let intentos = 0;

do {

    numeroIntentado = parseInt(prompt("Intenta adivinar el número"));
   intentos++;
    
} while (numeroIntentado !== numeroAAdivinar);


alert("El numero era: " + numeroAAdivinar + ", te ha costado " + intentos + " intentos")