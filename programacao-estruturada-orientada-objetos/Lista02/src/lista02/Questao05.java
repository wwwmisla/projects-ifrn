package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021 e 22/01/2021

/* OBS: Refiz a questão 05 depois da aula para encontrar meu erro, o erro estava no primeiro else if
tinha esquecido de calcular termino menos o inicio e fazer a comparação no primeiro IF*/
import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a hora que o jogo começou: ");
        int inicio = leia.nextInt();

        System.out.println("Digite a hora que o jogo terminou: ");
        int termino = leia.nextInt();

        if (inicio == termino || (termino - inicio) >= 1 || (inicio-termino) >=1) {
            if (inicio == termino) {
                System.out.println("O jogo durou 24 hora(s)");
            } else if (inicio < termino) {
                int duracao = termino - inicio;
                System.out.println("O jogo durou " + duracao + " hora(s)");
            } else {
                int duracao = (24 - inicio) + termino;// 24 horas ao dia
                System.out.println("O jogo durou " + duracao + " hora(s)");
            }
        }
    }
}
