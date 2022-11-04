/*      
        1 - Crie uma classe para representa carros
        Os carros possuem uma marca, uma cor e um gasto médio de combustível por Kilometro rodado.
        Crie um método que dado a quantidade de KMs e o preço do combustível nos dê o valor gasto 
        em reais para realizar este percurso.
*/

class Carro {
    marca;
    cor;
    gastoMedioDeCombustivel; // Em Litros

    constructor(marca, cor, gastoMedioDeCombustivel) {
        this.marca = marca;
        this.cor = cor;
        this.gastoMedioDeCombustivel = gastoMedioDeCombustivel;
    };

    calcularGastoViagem(precoCombustivel, kilometrosRodados) {
        const custoViagem = kilometrosRodados * this.gastoMedioDeCombustivel * precoCombustivel;
        return console.log(`O Seu custo da viagem será de R$${custoViagem} no ${this.marca}`);
    }
}


const camaro = new Carro('chevrolet', 'azul', 1/5);
camaro.calcularGastoViagem(2, 200);

const uno = new Carro('Fiat','prata', 1/10);
uno.calcularGastoViagem(2, 200);
