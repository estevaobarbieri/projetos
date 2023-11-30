import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite os dados da conta!");
        System.out.print("Numero: ");
        numero = sc.nextInt();
        System.out.println();

        System.out.print("Agencia: ");
        sc.nextLine();
        agencia = sc.nextLine();
        System.out.println();

        System.out.print("Nome Cliente: ");
        nomeCliente = sc.nextLine();
        System.out.println();

        System.out.print("Saldo: ");
        saldo = sc.nextDouble();
        System.out.println();


        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque!", nomeCliente, agencia, numero, saldo );
    }

}
