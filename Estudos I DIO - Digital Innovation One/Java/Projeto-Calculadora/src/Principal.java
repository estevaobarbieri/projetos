
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

    

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro valor: ");
        double numeroUm = scan.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double numeroDois = scan.nextDouble();

        Calculadora calcular = new Calculadora();

        System.out.println("\n");

        calcular.somar(numeroUm,numeroDois);
        System.out.println("A soma entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.subtrair(numeroUm,numeroDois);
        System.out.println("A subtração entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.dividir(numeroUm,numeroDois);
        System.out.println("A divisão entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.multiplicar(numeroUm,numeroDois);
        System.out.println("A multiplicação entre o numero 1 e 2 é: " + calcular.resultado);

        System.out.println("\n");
    }

    
}
