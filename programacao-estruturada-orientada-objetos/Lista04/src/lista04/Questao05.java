package lista04;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numero = new int[10];
        int maior = 0;
        int indice = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número: ");
            numero[i] = leia.nextInt();
        }
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] > maior) {
                    maior = numero[i];
                    indice=i;
                }              
            }
        System.out.println("Maior valor: " + maior + "\nO índice é: " + indice);
    }
}
