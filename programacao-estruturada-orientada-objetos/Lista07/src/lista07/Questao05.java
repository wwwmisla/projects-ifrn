package lista07;

import java.util.Scanner;

/*
Escreva um programa contendo uma função que retorna um boolean indicando se
um número natural positivo qualquer (valores inteiros maiores que zero) é primo.
 */
public class Questao05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leia.nextInt();

        boolean resultado = numeroPrimo(num);
        
        System.out.println("Verdadeiro ou falso: " + resultado);

    }
    
    public static boolean numeroPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            System.out.println("O número " + num + " é primo!");
            return true;
        } else {
            System.out.println("O número " + num + " não é primo!");
            return false;
        }

    }
}
