
/*  Melhorar o codigo usando Funções
    Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta
    e a escolha da condição de pagamento:
    Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.

    Código Condição de pagamento:
     - 1. A vista Débito, recebe 10% de desconto;
     - 2. A vista no Dinheiro ou Pix, recebe 15% de desconto;
     - 3. Em duas vezes, preço normal de etiqueta sem juros;
     - 4. Acima de duas vezes, preço normal de etiqueta mais juros de 10%;

*/

function aplicarDesconto(valor, desconto) {  //valor em reais e desconto em porcentagem
    return (valor - ((desconto / 100) * valor));
}

function aplicarJuros(valor, juros) {  //valor em reais e juros em porcentagem
    return (valor + ((juros / 100) * valor));
}

function calcularValorFinal(condicaoDePagameno, precoEtiqueta) {

    if (condicaoDePagameno === 1) {
        return 'Deve ser pago: R$' + aplicarDesconto(precoEtiqueta, 10);
    } else if (condicaoDePagameno === 2) {
        return 'Deve ser pago: R$' + aplicarDesconto(precoEtiqueta, 15);
    } else if (condicaoDePagameno === 3) {
        return 'Deve ser pago: R$' + precoEtiqueta;
    } else {
        return 'Deve ser pago: R$' + aplicarJuros(precoEtiqueta, 10);
    }
}

//Main
(function () {
    const precoEtiqueta= 100;
    const condicaoDePagameno = 3;

    console.log(calcularValorFinal(condicaoDePagameno, precoEtiqueta));

})();