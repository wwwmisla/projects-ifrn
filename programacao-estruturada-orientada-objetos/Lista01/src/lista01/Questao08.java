package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao08 {
        public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a temperatura: ");
        double celsius= leia.nextDouble();
        
        double conversaoFahrenheit= (9*celsius+160)/5;
        
        System.out.println("A temperatura em grau Celsius é: " + celsius + "ºC");
        System.out.println("A temperatura em grau Fahrenheit é: " + conversaoFahrenheit + "ºF");
        
    }
}
