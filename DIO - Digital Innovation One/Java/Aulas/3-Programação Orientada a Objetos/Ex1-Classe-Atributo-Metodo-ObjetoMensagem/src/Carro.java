
/*
 * 
 * Classe de exemplo para o exercicio da Aula 2 de Orientação a Objetos.
 * 
 */
class Carro {

    String modelo;
    String cor;
    int capacidadeTanque;

    //Construtor
    Carro(){

    }
    Carro(String modelo, String cor, int capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }


    void setModelo(String modelo){
        this.modelo = modelo;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }


    String getModelo(){
        return modelo;
    }
    String getCor(){
        return cor;
    }
    int getCapacidadeTanque(){
        return capacidadeTanque;
    }
     

    //Métodos
    double calculoCombustivel(double valorCombustivel){
        return valorCombustivel*capacidadeTanque;
    }
    
}
