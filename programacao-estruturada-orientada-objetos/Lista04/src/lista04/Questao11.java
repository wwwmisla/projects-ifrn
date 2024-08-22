package lista04;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Digite 20 números inteiros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Diga o " + (i + 1) + "º número:");
            vetor[i] = leia.nextInt();
        }
        System.out.println("Resultado da inversão:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

    }
}
