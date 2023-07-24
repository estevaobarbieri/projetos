/*
    2) Crie uma classe para representar pessoas.
    Para cada pessoa teremos os atributos nome, peso e altura.
    As pessoas devem ter a capacidade de dizer o valor do seu IMC(IMC = peso / (altura*altura));
    Instancie uma pessoa chamada José que tenha 70kg de peso e 1,75 de altura e peça para dizer o 
    valor do seu IMC;
*/

class Pessoa {
    nome;
    peso;
    altura;

    constructor(nome, peso, altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    };

    calculoIMC() {
        return this.peso / (Math.pow(this.altura, 2));
    };

    classificarIMC() {
        const IMC = this.calculoIMC();

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

}

const Jose = new Pessoa('Jose', 70, 1.75);

console.log(`O valor do IMC do(a) ${Jose.nome} é ${Jose.calculoIMC().toFixed(2)} / ${Jose.classificarIMC()}`);

