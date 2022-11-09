/* 
    2) Crie um programa que seja capaz de percorrer uma lista de números e imprima cada número par encontrado.
*/

const numeros = [7, 11, 32, 119, 239, 244, 326];

for (let i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 === 0) {
        console.log(`O seu valor par é ${numeros[i]}`);
    }
    //console.log(numeros[i] / 2);
}
