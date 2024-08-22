package lista05;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        int[][] matriz1= new int[5][5];
        int[][] matriz2= new int[5][5];
        int[][] matriz3= new int[5][5];
        
        //primeiro ler os valores para os elementos da matriz 1
        System.out.println("Digite 25 números inteiros para a primeira matriz: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                
                System.out.print("Posição [" + i + "] [" + j + "] = ");
                matriz1[i][j] = leia.nextInt();
                
            }
        }
        
        //segundo ler os valores para os elementos da matriz 2
        System.out.println("\nDigite números inteiros para a matriz 2: ");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                
                System.out.print("Posição [" + i + "] [" + j + "] = ");
                matriz2[i][j] = leia.nextInt();
                
            }
        }
        
        //terceiro fazer a subtração das duas matrizes e imprimir o resultado
        System.out.println("\nMatriz resultante da subtração:");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                
                matriz3[i][j]= matriz1[i][j] - matriz2[i][j];//subtração das matrizes
                System.out.print(matriz3[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
