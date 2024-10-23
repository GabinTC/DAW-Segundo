let nota;

do{

    nota = parseFloat(prompt("Dime la nota"))

} while (nota < 0 || nota > 10 || nota%1 !== 0)

if (nota >= 0 && nota <= 3){
    document.write("La nota " + nota + " es muy deficiente")
} else if (nota == 4){
    document.write("La nota " + nota + " es un insuficiente")
} else if (nota == 5){
    document.write("La nota " + nota + " es un suficiente")
} else if (nota == 6){
    document.write("La nota " + nota + " es un bien")
} else if (nota == 7 || nota == 8){
    document.write("La nota " + nota + " es un notable")
} else if (nota == 9 || nota == 10){
    document.write("La nota " + nota + " es un sobresaliente")
} 