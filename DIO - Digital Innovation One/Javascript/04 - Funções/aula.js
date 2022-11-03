
/*  Usando Funções
    O IMC - Indice de Massa Corporal é um critério da OMS para dar uma indicação sobre
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


function calcularIMC(peso, altura) {

    const IMC = peso / Math.pow(altura, 2);
    return IMC;
}

function classificarIMC(IMC) {

    if (IMC < 18.5) {
        return 'Abaixo do Peso';
    } else if (IMC >= 18.5 && IMC < 25) {
        return 'Peso Normal';
    } else if (IMC >= 25 && IMC < 30) {
        return 'Acima do peso';
    } else if (IMC >= 30 && IMC < 40) {
        return 'Obeso';
    } else {
        return 'Obesidade grave';
    }
}

// Main
(function () {
    const peso = 81
    const altura = 1.82

    const IMC = calcularIMC(peso, altura);
    console.log(IMC)
    console.log(classificarIMC(IMC))
})();

