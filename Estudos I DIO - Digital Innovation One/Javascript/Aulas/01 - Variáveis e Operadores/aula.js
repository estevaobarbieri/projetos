/*Faça um programa para calcular o valor de uma viagem:

 Você terá 3 variaveis, sendo elas:
    1 - Preço do combustivel;
    2 - Gasto médio de combustivel do carro por KM;
    3 - Distancia em KM da viagem;

Imprimir no console o valor que será gasto para realizar esta viagem.*/

const precoCombustivel = 4.69;
const gastoMedioPorKm = 10;
const distanciaEmKm = 200;

const custoTotal = (distanciaEmKm/gastoMedioPorKm)*precoCombustivel;

console.log(custoTotal);