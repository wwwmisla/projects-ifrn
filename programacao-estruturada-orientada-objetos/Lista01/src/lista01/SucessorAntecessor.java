package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class SucessorAntecessor {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero=leia.nextInt();
        
        int sucessor= numero +1;// Aumento de um número na variável
        int antecessor= numero -1;// Diminuição de um número na variável
        
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor: " + antecessor);
     }
}
