package lista003;

import java.util.Scanner;

public class Questao11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número natural: ");
        int n = leia.nextInt();

        int contador = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número " + n + " é primo.");
        } else {
            System.out.println("O número " + n + " não é primo.");
        }
    }
}
