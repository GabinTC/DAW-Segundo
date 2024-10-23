let usuario = `{
    "nombre" : "Gabin",
    "apellidos" : "Tellaeche",
    "fechaNacimiento" : "23/10"
}`

localStorage.setItem("usuario", usuario)

let usuarioCogido = localStorage.getItem("usuario")

let usuarioLS = JSON.parse(usuarioCogido);

alert("Hola " + usuarioLS.nombre + " " + usuarioLS.apellidos);

let fechaNacimiento = usuarioLS.fechaNacimiento;
let fechaActual = new Date();

let DiaMesFechaActual = fechaActual.getDate() + "/" + (fechaActual.getMonth() + 1)

if (fechaNacimiento == DiaMesFechaActual){
    alert("Feliz cumpleaños!")
}