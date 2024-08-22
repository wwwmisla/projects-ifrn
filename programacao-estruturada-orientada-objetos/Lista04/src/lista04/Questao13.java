package lista04;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vetorA1[] = new int[8];
        int vetorA2[] = new int[8];
        int vetorA3[] = new int[8];
        int vetorA4[] = new int[8];

        System.out.println("Digite 8 números para o vetor1:");
        for (int i = 0; i < vetorA1.length; i++) {
            vetorA1[i] = leia.nextInt();
        }
        
        System.out.println("Digite 8 números para o vetor2:");
        for (int i = 0; i < vetorA2.length; i++) {
            vetorA2[i] = leia.nextInt();
        }
        
        System.out.println("\nVetor A1:");
        for (int i = 0; i < vetorA3.length; i++) {
            vetorA3[i] = vetorA2[i];
            
            System.out.println(vetorA3[i]);
        }
        
        System.out.println("\nVetor A2:");
        for (int i = 0; i < vetorA4.length; i++) {
            vetorA4[i] = vetorA1[i];
            
            System.out.println(vetorA4[i]);
        }
    }
}
