package lista04;

import java.util.Scanner;

public class Questao12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] vetor = new double[10];
        double[] vetor2 = new double[10];
        double[] numeroQuadrado = new double[10];

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();
        }
        
        System.out.println("\nA2:");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Math.pow(vetor[i], 3);
            System.out.println(vetor2[i]);
        }
        System.out.println("\nNúmeros ao quadrado do vetor1:");
        for(int i = 0; i < vetor.length; i++){
            numeroQuadrado[i] = Math.pow(vetor[i], 2);
            System.out.println(numeroQuadrado[i]);
        }
        System.out.println("\nNúmeros ao quadrado do vetor2:");
        for (int i = 0; i < vetor2.length; i++) {
            numeroQuadrado[i] = Math.pow(vetor2[i], 2);
            System.out.println(numeroQuadrado[i]);
        }
    }
}
