package lista04;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int[] v = new int[10]; //vetor de inteiros de dez posições(0 a 9)
        
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite um valor inteiro:");
            v[i] = leia.nextInt(); 
           }
        for (int i = 0; i < v.length; i++) {
            System.out.println("Vetor " + (i+1) + " é igual a: " + v[i]);
            //(i+1) para que na saída não apareça o 0 no ínicio
        }
    }
}
