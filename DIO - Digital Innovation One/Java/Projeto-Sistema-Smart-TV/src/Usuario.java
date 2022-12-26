public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("\n");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo Status 1 => TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status 2 => TV ligada? " + smartTv.ligada);


        smartTv.canalAnterior();
        System.out.println("Novo Status 2 => Canal Atual? " + smartTv.canal);
        smartTv.selecionarCanal(15);
        System.out.println("Novo Status 3 => Canal Atual? " + smartTv.canal);


        smartTv.aumentarVolume();
        System.out.println("Novo Status 1 => Volume? " + smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Novo Status 2 => Volume? " + smartTv.volume);


        System.out.println("\n");
    }
}
