package lista07;

import java.util.Scanner;

/*
Escreva um programa contendo uma função que calcula o fatorial de um número
natural qualquer (tipo inteiro). Lembre-se que 0! = 1 e que 1! = 1.
 */
public class Questao06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leia.nextInt();

        int resultado = fatorial(num);

        System.out.println("Resultado do fatorial: " + resultado);
    }
    
    public static int fatorial(int x) {
        /* forma número 1 de fazer 
        int f = x;
        while (x > 1) {
            f = f * (x - 1);
            x--;
        }
        return f;*/

        //forma número 2
        int fatorial = 1;

        for (int i = 1; i <= x; i++) {
            fatorial = fatorial * i;
        }
        return fatorial;
    }
}
