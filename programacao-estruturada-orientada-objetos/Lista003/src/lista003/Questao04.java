package lista003;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número natural: ");
        int num = leia.nextInt();

        int cont = 0;
        while (cont < num) {
            cont++;
            if (num % cont == 0) {
                System.out.println("Número divisivel por: " + cont);
            }
        }

    }
}
