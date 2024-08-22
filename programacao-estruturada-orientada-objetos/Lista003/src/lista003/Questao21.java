package lista003;

import java.util.Scanner;

public class Questao21 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int totalAprovadosCont = 0;
        int totalReprovadosCont = 0;
        int matricula = 0;

        do {
            System.out.println("Digite sua matrícula: ");
            matricula = leia.nextInt();
            if (matricula != 9999) {

                System.out.println("Nota 1: ");
                double nota1 = leia.nextDouble();

                System.out.println("Nota 2: ");
                double nota2 = leia.nextDouble();

                System.out.println("Nota 3: ");
                double nota3 = leia.nextDouble();

                double mediaFinal = ((2 * nota1) + (3 * nota2) + (4 * nota3)) / 9.0;

                System.out.println("Matrícula: " + matricula );
                System.out.println("Média final: " + mediaFinal);
                if (mediaFinal >= 5.0) {

                    System.out.println("Aprovado!");
                    totalAprovadosCont++;
                } else {
                    System.out.println("Reprovado!");
                    totalReprovadosCont++;
                }
            }
        } while (matricula != 9999);

        System.out.println("Total de alunos aprovados: " + totalAprovadosCont);
        System.out.println("Total de alunos reprovados: " + totalReprovadosCont);
        System.out.println("Total de alunos: " + (totalAprovadosCont + totalReprovadosCont));
    }
}
