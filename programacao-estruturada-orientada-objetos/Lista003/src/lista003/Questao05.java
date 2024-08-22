package lista003;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de alunos: ");
        int qAlunos= leia.nextInt();
        
        int i=0; int j=0;
        while(i<qAlunos){
            i++;
            System.out.println("Digite a idade do aluno: ");
            int idade= leia.nextInt();
            j = j + idade;
        }
        int media=0;
        media= j/qAlunos;
        System.out.println("A média da idade da turma é: " + media + " anos.");
    }
}
