package lista05;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        //primeiro receber os valores para saber como será a matriz
        System.out.println("Digite a quantidade de linhas para a matriz:");
        int linhas = leia.nextInt();

        System.out.println("Digite a quantidade de colunas para a matriz:");
        int colunas = leia.nextInt();

        String[][] matriz = new String[linhas][colunas];

        //segundo receber os valores de cada elemento
        System.out.println("\nDigite valores em String para a matriz [" 
        + linhas + "][" + colunas + "]: " );
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print("Linha [" + i + "] Coluna [" + j +"]" + " = " );
                
                matriz[i][j] = leia.next();
                
            }
        }
        
        //terceiro imprimir o resultado da matriz
        System.out.println("\nMatriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
