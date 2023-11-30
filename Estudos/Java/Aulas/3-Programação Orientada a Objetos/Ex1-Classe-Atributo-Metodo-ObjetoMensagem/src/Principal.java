public class Principal {
    public static void main(String[] args) {
        /////////////////////////////////////////////Carro 1/////////////////////////////////////////////////////////////
        //Criando novo carro e setando seus dados
        Carro carro1 = new Carro();

        carro1.setModelo("Camaro SS");
        carro1.setCor("Prata");
        carro1.setCapacidadeTanque(67);

        //Pritando o valor do tanque
        System.out.println("\n");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println("Capacidade tanque: " + carro1.getCapacidadeTanque() + " litros");
        System.out.println("Tanque cheio: R$" + carro1.calculoCombustivel(5.1) + " reais");
        System.out.println("\n");


        /////////////////////////////////////////////Carro 2/////////////////////////////////////////////////////////////
        //Criando novo carro e setando seus dados
        Carro carro2 = new Carro("Corsa", "Prata", 36);

        //Pritando o valor do tanque
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println("Capacidade tanque: " + carro2.getCapacidadeTanque() + " litros");
        System.out.println("Tanque cheio: R$" + carro2.calculoCombustivel(5.1) + " reais");
        System.out.println("\n");


    }
}
