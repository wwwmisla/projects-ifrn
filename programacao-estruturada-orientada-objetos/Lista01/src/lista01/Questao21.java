package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double numero=leia.nextDouble();
        
        double sen= Math.sin(numero);
    // Função para obter o seno de um ângulo
    
        double cos= Math.cos(numero);
    // Função para obter o cosseno de um ângulo
        
        double tan=  Math.tan(numero);
    // Função para obter o tangente de um ângulo
        
        System.out.println("O Seno do ângulo é : " + sen + "\nO Cosseno do ângulo é : " 
        + cos + "\nA Tangente do ângulo é : " + tan);
    }
}
