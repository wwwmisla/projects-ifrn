package lista07;

import java.util.Scanner;

/*
Escreva um programa contendo uma função que retorna a quantidade de divisores
naturais que um número positivo possui.
*/
public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um valor:");
        int numeroDigitado = leia.nextInt();
        
        int resultado = divisores(numeroDigitado);
        
        
        System.out.println("\nQuantidade de números divisores: " + resultado);
    }
    
    public static int divisores(int num) {
        int i = 1;
        int cont = 0;

        System.out.println("Divisores de " + num + ": " );

        while (i <= num) {
            
            if (num % i == 0) {
                System.out.print(i + " ");
                cont++;
            } 
            i++;
        }

        return cont;
    }
}
