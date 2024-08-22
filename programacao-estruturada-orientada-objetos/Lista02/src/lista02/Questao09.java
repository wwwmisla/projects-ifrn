package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a velocidade máxima permitida: ");
        int velocidadeMaxima = leia.nextInt();

        System.out.println("Digite a velocidade com que o motorista está dirigindo: ");
        int velocidade = leia.nextInt();

        int velocidadeUltrapassada = velocidade - velocidadeMaxima;

        if (velocidadeUltrapassada >= 1 && velocidadeUltrapassada <= 10) {
            System.out.println("Total da multa: 50,00 R$");
        }
        if (velocidadeUltrapassada >= 11 && velocidadeUltrapassada <= 30) {
            System.out.println("Total da conta: 100,00 R$");
        }
        if (velocidadeUltrapassada >= 31) {
            System.out.println("Total da multa: 200,00 R$");
        }
    }
}
