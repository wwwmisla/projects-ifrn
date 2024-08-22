package lista04;

import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] alunos = new int[90];
        int horas = 0;
        int cont = 0;
        int contadorMenos = 0;

        System.out.println("Obs: os únicos valores válidos vão ser entre 0 e 310 ");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite a quantidade de horas que você acessau a internet no mês passado: ");
            alunos[horas] = leia.nextInt();

            if (alunos[horas] > 100 && alunos[horas] <= 310) {
                cont++;
            }
            if (alunos[horas] < 10 && alunos[horas] >= 0) {
                contadorMenos++;
            }

        }

        System.out.println("A quantidade de alunos que ficaram mais de 100 horas na internet é: " + cont);
        System.out.println("A quantidade de alunos que ficaram menos de 10 horas na internet é: " + contadorMenos);

    }
}
