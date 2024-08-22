package lista04;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10];

        int numeroLido = 0;
        int maior = 0;
        int posicaoMa = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = leia.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMa = i;  
            }
        }
        System.out.println("Elemento maior com valor original: " + maior + " Posição: " + posicaoMa);
        int ultimo = vetor[vetor.length - 1];
        System.out.println("O último elemento com valor original: " + ultimo + " Posição: 9\n");

        System.out.println("Troca entre a posição do maior número lido por o último: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == vetor[posicaoMa]) {
                System.out.println(ultimo);
            } else if (vetor[i] == vetor[vetor.length - 1]) {
                System.out.println(maior);
            } else {
                System.out.println(vetor[i]);
            }
        }
    }
}