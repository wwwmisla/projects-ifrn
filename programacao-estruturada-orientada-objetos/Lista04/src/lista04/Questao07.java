package lista04;

import java.util.Scanner;

public class Questao07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = {1, 2, 5, 8, 3, 4, 9, 10, 6, 7};
        int achou = 0; 
        int x = 0;
        int posicao = 0;

        System.out.println("O vetor contêm 10 números. ");
        System.out.println("Digite um número para que seja encontrado o valor X: ");
        x = leia.nextInt();

        for (int j = 0; j < vetor.length; j++) {
            if (x == vetor[j]) {
                achou = 1;
                posicao = j;   
            }  
        }
        if (achou ==0) {
            System.out.println("O valor não foi encontrado!");
        } else{
            System.out.println("O valor foi encontrado! " + "\nNúmero: " + x + "\nPosição: " + posicao);
        }
    }
}
