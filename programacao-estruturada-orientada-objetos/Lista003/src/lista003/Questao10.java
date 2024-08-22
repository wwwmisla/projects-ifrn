package lista003;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cont = 0;
        int contX = 0;
        int numero;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite um número: ");
            numero = leia.nextInt();

            if (numero > 0 && numero < 100) {
                cont++;

            } else {
                contX++;
            }
        }
        System.out.println("Existem " + cont + " número(s) no intervalo de [0,100] ");
        System.out.println("Existem " + contX + " número(s) fora do intervalo de [0,100]");
    }
}
