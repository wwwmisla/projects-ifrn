package lista04;

import java.util.Scanner;

public class Questao14 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        //ler valores para o primeiro vetor
        System.out.println("Digite 10 valores para o vetor1:");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = leia.nextInt();
        }
        //ler valores para o segundo vetor
        System.out.println("Digite 10 valores para o vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = leia.nextInt();
        }
        
        System.out.println("Multiplicação dos valores do vetor1 pelo vetor2:");
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] * vetor2[i];
            System.out.println("Posição: " + (i+1) + " Resultado: " + vetor3[i] );
        } 
    }
}


