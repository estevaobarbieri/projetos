
/*Faça um programa para calcular o valor de uma viagem:

 Você terá 5 variaveis, sendo elas:
    1 - Preço do etanol;
    2 - Preço da gasolina;
    3 - O tipo de combustivel que está no seu carro;
    4 - Gasto médio de combustivel do carro por KM;
    5 - Distancia em KM da viagem;

Imprimir no console o valor que será gasto para realizar esta viagem.*/

const precoEtanol = 3.89;  // Combustivel tipo 0
const precoGasolina = 4.98; // Combustivel tipo 1
const tipoDeCombustivel = 'Gasolina';
const gastoMedioDeCombustivel = 10; //   KM/L
const distanciaEmKm = 200; // KM

if (tipoDeCombustivel === 'Gasolina') {
    const precoFinal = (distanciaEmKm / gastoMedioDeCombustivel) * precoGasolina;
    console.log(precoFinal.toFixed(2));
} else {
    const precoFinal = (distanciaEmKm / gastoMedioDeCombustivel) * precoEtanol;
    console.log(precoFinal.toFixed(2));
}
