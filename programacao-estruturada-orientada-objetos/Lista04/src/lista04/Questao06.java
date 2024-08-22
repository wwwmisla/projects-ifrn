package lista04;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numero = new int[10];
        int maior = numero[0];
        int menor = numero[0];
        int indiceMa = 0;
        int indiceMe = 0;

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número: ");
            numero[i] = leia.nextInt();
        }
        if (numero.length > 0) {
                maior = numero[0];
                menor = numero[0];
                indiceMa = 0;
                indiceMe = 0;
                for (int i = 0; i < numero.length; i++) {
                    if (maior < numero[i]) {
                        maior = numero[i];
                        indiceMa = i;
                    }
                    if (numero[i] < menor) {
                        menor = numero[i];
                        indiceMe = i;
                    }
                }
            }
        System.out.println("Maior valor: " + maior + "\nO índice é: " + indiceMa);
        System.out.println("Menor valor: " + menor + "\nO índice é: " + indiceMe);
    }
}