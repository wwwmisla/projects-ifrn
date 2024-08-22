package lista05;

import java.util.Scanner;
//Obs.: Refiz toda a questão depois da aula síncrono para compreender melhor a lógica dela

public class Questao05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[][] valorNotas = {{9.0, 9.0, 9.0}, {7.5, 7.5, 7.5}, {6.0, 6.0, 6.0},
        {3.0, 3.0, 3.0}, {2.9, 2.9, 2.9},{9.0, 7.5, 9.0}, {7.5, 9.0, 7.5}, {7.5, 6.0, 6.0},
        {3.0, 9.0, 3.0}, {2.9, 9.0, 2.9},{6.0, 7.5, 9.0}, {2.9, 9.0, 7.5}, {7.5, 9.0, 6.0},
        {3.0, 2.9, 3.0}, {2.9, 9.0, 2.9},{7.5, 7.5, 9.0}, {2.9, 9.0, 2.9}, {6.0, 9.0, 6.0},
        {2.9, 2.9, 3.0}, {9.0, 9.0, 2.9}};

        for (int i = 0; i < valorNotas.length; i++) {
            System.out.println("Notas do " + (i + 1) + "º aluno:");
            double notaFinal = 0;
            for (int j = 0; j < valorNotas[i].length; j++) {
                System.out.print(valorNotas[i][j] + " ");
                if (j == 2) {
                    notaFinal = notaFinal + valorNotas[i][j] * 0.2;
                } else {
                    notaFinal = notaFinal + (valorNotas[i][j] * 0.4);
                }
            }
            System.out.println("\nValor da nota final: " + notaFinal);

            if (notaFinal >= 9.0) {
                System.out.println("Conceito A");
            } else if (notaFinal >= 7.5 && notaFinal < 9.0) {
                System.out.println("Conceito B");
            } else if (notaFinal >= 6.0 && notaFinal < 7.5) {
                System.out.println("Conceito C");
            } else if (notaFinal >= 3.0 && notaFinal < 6.0) {
                System.out.println("Conceito R(prova de recuperação)");
            } else {
                System.out.println("Conceito D");
            }
            System.out.println();
        }
        for (int i = 0; i < valorNotas[0].length; i++) {
            double soma1 = 0.0;
            for (int j = 0; j < valorNotas.length; j++) {

                soma1 = soma1 + valorNotas[j][i];
            }
            double valorMedia = soma1 / valorNotas.length;
            System.out.println("Média da coluna número " + (i + 1) + " = " + valorMedia);
        }
    }
}
