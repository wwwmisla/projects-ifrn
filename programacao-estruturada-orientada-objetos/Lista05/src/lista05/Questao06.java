package lista05;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[][] matriz1 = new int[5][5];
        int[][] matriz2 = new int[5][5];
        int[][] matriz3 = new int[5][5];

        //primeiro ler os valores para os elementos da matriz 1
        System.out.println("Digite 25 números inteiros para a primeira matriz [5][5]: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                
                System.out.print("Posição [" + i + "] [" + j + "]" + " = ");
                matriz1[i][j] = leia.nextInt();
                
            }
        }

        //segundo ler os valores para os elementos da matriz 2
        System.out.println("\nDigite 25 números inteiros para a segunda matriz [5][5]: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) { 
                
                System.out.print("Posição [" + i + "] [" + j + "]" + " = ");
                matriz2[i][j] = leia.nextInt();
                
            }
        }

        //terceiro realizar a soma entre as duas matrizes e imprimir o resultado
        System.out.println("\nMatriz resultante da soma:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];//soma entre duas matrizes
                
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
