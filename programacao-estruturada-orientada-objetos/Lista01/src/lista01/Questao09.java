package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao09 {
        public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a temperatura: ");
        double fahrenheit= leia.nextDouble();
        
        double conversaoCelsius=(fahrenheit-32.0)*(5.0/9.0); 
// Lembrar que ambos os lados devem estar com o mesmo tipo de variável.

        System.out.println("A temperatura em grau Fahrenheit é: " + fahrenheit + "ºF");
        System.out.println("A temperatura em grau Celsius é: " + conversaoCelsius + "ºC");       
        }
}
