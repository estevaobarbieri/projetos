let vitorias = 150
let derrotas = 1


let nivelRankeadas = calculadoraRankeadas(vitorias, derrotas)
let saldoTotal = saldoVitorias(vitorias, derrotas)

console.log(`O Heroi tem de saldo de ${saldoTotal} está no nivel de ${nivelRankeadas} `)



function calculadoraRankeadas (vitorias, derrotas){

    let saldo = saldoVitorias(vitorias, derrotas);
    let nivel;

    if(saldo <= 10) nivel = "Ferro";
    else if(saldo >= 11 && saldo <= 20) nivel = "Bronze"
    else if(saldo >= 21 && saldo <= 50) nivel = "Prata"
    else if(saldo >= 51 && saldo <= 80) nivel = "Ouro"
    else if(saldo >= 81 && saldo <= 90) nivel = "Diamante"
    else if(saldo >= 91 && saldo <= 100) nivel = "Lendário"
    else if(saldo >= 101) nivel = "Imortal"

    return nivel
}

function saldoVitorias(vitorias, derrotas){
    return vitorias - derrotas;
}

