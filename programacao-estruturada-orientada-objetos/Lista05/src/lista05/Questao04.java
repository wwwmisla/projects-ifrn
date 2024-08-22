package lista05;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] matriz = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}};
        double x = 0; // valor que será digitado 
        int achou = 0; //variavel para saber se o valor será encontrado
        int posicaoI = 0; //para saber a posição do índice i
        int posicaoJ = 0; //para saber a posição do índice j

        //receber o número ao qual o usuário quer encontrar
        System.out.println("Digite um número real para que seja encontrado na matriz [3][3]: ");
        x = leia.nextDouble();

        /*primeiro fazer comparação para saber se o valor digitado está na matriz, caso
        esteja o valor de achou passará a ser 1, as posições i e j acomularam os valores de I e J 
         */
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    achou = 1;
                    posicaoI = i;
                    posicaoJ = j;
                }
            }
        }

        //segundo saber se a variável achou é igual 1, caso não seja o valor não foi encontrado 
        if (achou == 1) {
            System.out.println("O valor foi encontrado! " + "\nNúmero: " + x
                    + "\nLinha: " + posicaoI + " Coluna: " + posicaoJ);
        } else {
            System.out.println("O valor digitado infelizmente não foi encontrado!");
        }
    }
}
