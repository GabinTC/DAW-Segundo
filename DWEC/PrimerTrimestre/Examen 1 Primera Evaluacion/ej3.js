const correcciones = {
    
    "levtación": "leviacion",
    "volae": "volar",
    "abrakadbra": "abracadabra"
}

let texto = "levtación volae abrakadbra"

function corregirHechizo (correcciones, texto){
    

    for (const property in correcciones) {
        
        texto = texto.replaceAll(property, correcciones[property]) 
    }

    return texto;
}

alert(corregirHechizo(correcciones, texto));