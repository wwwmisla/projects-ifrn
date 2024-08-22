package lista04;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for ( int i = vetor.length -1;i >=0; i--) {
            System.out.println("Digite um número:");
            vetor[i] = leia.nextInt();
        }
        for ( int i = vetor.length -1;i >=0; i--) {
              System.out.println("Vetor: " + (i+1) + " é igual a: " + vetor[i]); 
        //(i + 1) para iniciar 1 ou i caso queira iniciar o vetor em 0
        }
    }
}
