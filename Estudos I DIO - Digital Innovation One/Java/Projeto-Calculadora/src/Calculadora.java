/*
 * <h1>Calculadora<h1>
 * A Calculadora realiza operações matemáticas entre dois números inteiros
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para
 * desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Estevão Barbieri
 * @version 1.0
 * @since 26/12/2022
 * 
 */

// import java.util.Locale;
// import java.util.Scanner;


public class Calculadora {
    /*
     * Este método é utilizado para somar, subtrair, dividir e multiplicar dois número inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return double o resultado deste método é a soma, subtração, multiplicaçao ou divisão de dois números.
     */
    double resultado = 0;

    public void somar(double numeroUm, double numeroDois){
        resultado = numeroUm + numeroDois;
    }
    public void subtrair(double numeroUm, double numeroDois){
        resultado = numeroUm - numeroDois;
    }
    public void dividir(double numeroUm, double numeroDois){
        resultado = numeroUm / numeroDois;
    }
    public void multiplicar(double numeroUm, double numeroDois){
        resultado = numeroUm * numeroDois;
    }

}
