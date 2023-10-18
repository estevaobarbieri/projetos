
const entradas = [8, 50, 10, 99, 23, 50, 10, 98, 23];
let i = 0;

function gets() {
    const valor = entradas[i];
    i++;
    return valor;
}

function print(texto) {
    console.log(texto);
}

module.exports = { gets, print }; // Necessário para exportar uma funcao