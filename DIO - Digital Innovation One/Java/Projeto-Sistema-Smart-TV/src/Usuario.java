public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("\n");
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);
//----------------------------------------------------------------------------//
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);
//----------------------------------------------------------------------------//
        smartTv.proximoCanal();
        System.out.println("Proximo Canal? " + smartTv.canal);
        smartTv.canalAnterior();
        System.out.println("Canal Anterior? " + smartTv.canal);
        smartTv.selecionarCanal(15);
        System.out.println("Canal selecionado? " + smartTv.canal);
//----------------------------------------------------------------------------//
        smartTv.aumentarVolume();
        System.out.println("Aumentar volume? " + smartTv.volume);      
        smartTv.diminuirVolume();
        System.out.println("Diminuir volume? " + smartTv.volume);
//----------------------------------------------------------------------------//
        System.out.println("\n");
    }
}
