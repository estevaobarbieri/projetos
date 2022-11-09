


const notas = [];

notas.push(4);
notas.push(9);
notas.push(5);

let soma = 0;
for (let i = 0; i < notas.length; i++) {
    soma = soma + notas[i];
    console.log(soma);
}

const media = soma / notas.length;

console.log(media);