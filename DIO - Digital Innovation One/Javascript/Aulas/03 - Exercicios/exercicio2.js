/*

    2) O IMC - Indice de Massa Corporal é um critério da OMS para dar uma indicação sobre
    a condição de peso de uma pessoa adulta.

    Formula do IMC:
    IMC = peso / (altura * altura)

    Elabore um algoritimo que dado o peso e a altura de um adulto mostre sua condição de acordo com a tabela abaixo.

    IMC em adultos Condição:
     - Abaixo de 18.5 : Abaixo do peso;
     - Entre 18.5 e 25 : Peso normal;
     - Entre 25 e 30 : Acima do peso;
     - Entre 30 e 40 : Obeso;
     - Acima de 40 : Obesidade grave;
*/

const pesoEmKg = 85;
const alturaEmM = 1.84;

const IMC = pesoEmKg / Math.pow(alturaEmM, 2);

console.log(IMC);

if (IMC < 18.5) {
    console.log('Abaixo do Peso');
} else if (IMC >= 18.5 && IMC < 25) {
    console.log('Peso Normal');
} else if (IMC >= 25 && IMC < 30) {
    console.log('Acima do peso');
} else if (IMC >= 30 && IMC < 40) {
    console.log('Obeso');
} else {
    console.log('Obesidade grave');
}