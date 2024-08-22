package lista05;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        char[][] matriz = new char[3][3];// quantidade de linhas e colunas escolhidas por mim

        //primeiro receber os valores em caractere 
        System.out.println("Digite um caractere para cada elemento da matriz [3][3]: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print("Linha [" + i + "] Coluna [" + j +"]" + " = " );
                matriz[i][j] = leia.next().charAt(0);
            }
        }
        
        //segundo ler os elementos digitados e fazer a ordem inversa por meio do for
        System.out.println("\nMatriz:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                
                System.out.print(matriz[i][j] + " ");
                
            }
            System.out.println();
        }
    }
}
