const ingredientes = ["cebolla", "patatas", "huevo", "atun"]
const ingredientesIncorrectos = ["cebolla", "atun"]

function filtrarIngredientes(ingredientes, ingredientesIncorrectos) {
    return ingredientes.filter((ingrediente) => ingredientesIncorrectos.indexOf(ingrediente) == -1)
}

filtrarIngredientes(ingredientes, ingredientesIncorrectos).forEach(ingrediente => {
    document.write(ingrediente + " ")
})