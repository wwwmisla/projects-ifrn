package lista05;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        //primeiro ler valores em inteiros digitados pelo usuário
        System.out.println("Digite números inteiros para a matriz [3][3]: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print("Linha [" + i + "] Coluna [" + j + "]" + " = ");
                matriz[i][j] = leia.nextInt();
            }
        }
        
        /*segundo fazer um for com um if para quando os índices forem iguais aparecer 
        na matriz se não o valor será 0*/
        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if (i == j) {
                    
                    System.out.print(matriz[i][j] + " ");
                    
                } else {
                    
                    matriz[i][j] = 0;
                    System.out.print(matriz[i][j] + " ");
                    
                }
            }
            System.out.println();
        }
    }
}
