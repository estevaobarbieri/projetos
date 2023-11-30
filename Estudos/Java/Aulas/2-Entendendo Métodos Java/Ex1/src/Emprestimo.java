public class Emprestimo {
    
    public static void parcelas(double valor,int parcela) {

        double taxa2 = 0.1, taxa3 = 0.15, taxa4=0.2, taxa5=0.25;


        if(parcela == 2){
            double valorFinal = valor + (taxa2 * valor);
            System.out.println("O valor final para " + parcela + " parcelas é: " + valorFinal);
            
        }else if(parcela == 3){
            double valorFinal = valor + (taxa3 * valor);
            System.out.println("O valor final para " + parcela + " parcelas é: " + valorFinal);

        }else if(parcela == 4){
            double valorFinal = valor + (taxa4 * valor);
            System.out.println("O valor final para " + parcela + " parcelas é: " + valorFinal);

        }else if(parcela == 5){
            double valorFinal = valor + (taxa5 * valor);
            System.out.println("O valor final para " + parcela + " parcelas é: " + valorFinal);

        }else{
            System.out.println("Parcela inválida, selecione uma parcela válida!");
        }


    }

}
