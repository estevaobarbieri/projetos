import java.util.Scanner; 
    
public class Desafio1{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        String saida="/";

        for(int i = 1; i<tamanho; i++ ){
          saida = "/" + saida;
        }
        System.out.println(saida);
        
        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

    }
}
