package lista003;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numEntrada = leia.nextInt();

        int numMultiplicador = 1;

        while (numMultiplicador <= 10) {
            int numResultado = numEntrada * numMultiplicador;
            System.out.println(numMultiplicador + " X " + numEntrada + " = " + numResultado);
            numMultiplicador++;
        }
    }
}
