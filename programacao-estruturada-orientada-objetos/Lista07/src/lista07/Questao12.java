package lista07;

import java.util.Scanner;

/*
Escreva um programa contendo uma função que retorna o maior elemento contido
em qualquer matriz do tipo inteiro.
 */
public class Questao12 {

    public static void exibeMatriz(int[][] matriz) {

        System.out.println("A Matriz ficou:\n ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {

                    maior = matriz[i][j];
                    
                }
            }
        }
        System.out.printf("Maior elemento da matriz: " + maior);
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        Scanner leia = new Scanner(System.in);
        System.out.println("Matriz [3][3]\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Informe um valor para a posição [" + i + "][" + j + "] da matriz: ");
                matriz[i][j] = leia.nextInt();
            }
        }
        exibeMatriz(matriz);
    }

}
