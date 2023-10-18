/*

    3) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta
    e a escolha da condição de pagamento:
    Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.

    Código Condição de pagamento:
     - 1. A vista Débito, recebe 10% de desconto;
     - 2. A vista no Dinheiro ou Pix, recebe 15% de desconto;
     - 3. Em duas vezes, preço normal de etiqueta sem juros;
     - 4. Acima de duas vezes, preço normal de etiqueta mais juros de 10%;

*/

const precoEtiqueta = 100;
const condicaoDePagameno = 4;

if (condicaoDePagameno === 1) {
    const valorTotalAPagar = precoEtiqueta * 0.9
    console.log('Deve ser pago: ');
    console.log(valorTotalAPagar)
} else if (condicaoDePagameno === 2) {
    const valorTotalAPagar = precoEtiqueta * 0.85
    console.log('Deve ser pago: ');
    console.log(valorTotalAPagar)
} else if (condicaoDePagameno === 3) {
    const valorTotalAPagar = precoEtiqueta * 1
    console.log('Deve ser pago: ');
    console.log(valorTotalAPagar)
} else {
    const valorTotalAPagar = precoEtiqueta * 1.1
    console.log('Deve ser pago: ');
    console.log(valorTotalAPagar)
}