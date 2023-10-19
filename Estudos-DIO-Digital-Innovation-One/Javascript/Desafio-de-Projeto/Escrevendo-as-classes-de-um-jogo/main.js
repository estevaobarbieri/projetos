

class Heroi{
    constructor(nome, idade, tipo){
        this.nome = nome
        this.idade = idade
        this.tipo = tipo
    }

    atacar(){
        let tipoDeAtaque = "";
        switch(this.tipo){
            case "mago" : 
                tipoDeAtaque = "magia";
                break;
            case "guerreiro" :
                tipoDeAtaque = "espada"  ;
                break;     
            case "monge" : 
                tipoDeAtaque = "artes marciais";  
                break;    
            case "ninja" :
                tipoDeAtaque = "shuriken";
                break;
        }

        console.log(`O ${this.tipo} atacou usando ${tipoDeAtaque}`)
    }
}


let novoMago = new Heroi("Zika", 25, "mago")
let novoGuerreiro = new Heroi("Doidao", 33, "guerreiro")
let novoMonge = new Heroi("Alter", 73, "monge")
let novoNinja = new Heroi("DElter", 23, "ninja")


novoMago.atacar()
novoGuerreiro.atacar()
novoMonge.atacar()
novoNinja.atacar()