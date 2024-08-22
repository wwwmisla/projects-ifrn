package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double numero1=leia.nextDouble();
        
        System.out.println("Digite um número: ");
        double numero2=leia.nextDouble();
        
        double soma= numero1 + numero2;
        System.out.println("A soma é: " + soma);
    }
}
