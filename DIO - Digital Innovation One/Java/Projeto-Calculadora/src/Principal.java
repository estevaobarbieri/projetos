public class Principal {
    public static void main(String[] args) throws Exception{

        double numeroUm = 6;
        double numeroDois = 2;

        Calculadora calcular = new Calculadora();

        System.out.println("\n\n");

        calcular.somar(numeroUm,numeroDois);
        System.out.println("A soma entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.subtrair(numeroUm,numeroDois);
        System.out.println("A subtração entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.dividir(numeroUm,numeroDois);
        System.out.println("A divisão entre o numero 1 e 2 é: " + calcular.resultado);

        calcular.multiplicar(numeroUm,numeroDois);
        System.out.println("A multiplicação entre o numero 1 e 2 é: " + calcular.resultado);

        System.out.println("\n\n");
        
    }
}
