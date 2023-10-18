public class Mensagem {
    
    public static void horaDoDia(int hora) {

        if(hora >= 6 && hora < 12) System.out.println(" Bom dia!");
        else if(hora >= 12 && hora < 18) System.out.println(" Boa tarde!");
        else if(hora >= 18 && hora < 25) System.out.println(" Boa noite!");
        else if(hora >= 0 && hora < 6) System.out.println(" Boa noite!");

        else System.out.println(" Hora inválida");
        
    }

}
