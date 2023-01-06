public class Calculadora {
    
    public static void soma(double num1, double num2){

        double result = num1 + num2;

        System.out.println(" " + num1 + " + " + num2 + " = " + result);
    }

    public static void subtracao(double num1, double num2){

        double result = num1 - num2;

        System.out.println(" " + num1 + " - " + num2 + " = " + result);
    }

    public static void multiplicacao(double num1, double num2){
        
        double result = num1 * num2;

        System.out.println(" " + num1 + " x " + num2 + " = " + result);
    }

    public static void divisao(double num1, double num2){
        
        double result = num1 / num2;

        System.out.println(" " + num1 + " / " + num2 + " = " + result);
    }

}
