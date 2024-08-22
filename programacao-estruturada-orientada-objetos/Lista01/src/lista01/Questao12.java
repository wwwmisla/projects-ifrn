package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao12 {
        public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um valor em Euro: ");
        double valorEuro=leia.nextDouble();
        
        double valorReal=valorEuro*4.32;
        System.out.println("O resultado em reais é: " + valorReal + "R$");
        }
}
