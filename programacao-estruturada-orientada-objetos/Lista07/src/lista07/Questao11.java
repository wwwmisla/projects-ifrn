package lista07;

import java.util.Scanner;

public class Questao11 {

    public static void exibeMatriz(String[][] matriz) {

        System.out.println("A Matriz ficou:\n ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] matriz = new String[3][3];

        Scanner leia = new Scanner(System.in);
        System.out.println("Matriz [3][3]\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("Informe um valor do tipo String para a posição [" + i + "][" + j + "] da matriz: ");
                matriz[i][j] = leia.next();
            }
        }
        exibeMatriz(matriz);
    }
}
