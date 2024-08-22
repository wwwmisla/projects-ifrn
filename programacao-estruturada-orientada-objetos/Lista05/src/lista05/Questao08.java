package lista05;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[6][6];
        int[] vetor1 = new int[12];
        int[] vetor2 = new int[6];

        //primeiro temos que ler os valores de cada elemento para a matriz
        System.out.println("Digite os valores para a matriz [6][6]: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("Posição [" + i + "] [" + j + "] = ");
                matriz[i][j] = leia.nextInt();

            }
        }

        //segundo temos que imprimir a matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
        
        //terceiro temos que imprimir os elementos das linhas pares 2 e 4, colocando os valores dos índices da matriz no vetor1
        System.out.println();
        System.out.print("Elementos nas linhas pares(2 e 4): ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (i % 2 == 0 && i != 0) {
                    
                    vetor1[i] = matriz[i][j];
                    System.out.print(vetor1[i] + " ");
                    
                }
            }
        }

     
        //quarto temos que saber os valores da diagonal, colocar os elementos da matriz no vetor2 e imprimir
        System.out.println();
        System.out.print("Elementos da diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    
                    vetor2[i] = matriz[i][j];
                    System.out.print(vetor2[i] + " ");
                    
                }
            }
        }  
    }
}
