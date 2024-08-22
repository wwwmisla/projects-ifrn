package lista04;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double[] notas = new double[30]; 
        
        int contAlunosMaior = 0;
        double media = 0;
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do " + (i+1) + " º aluno:");
            notas[i] = leia.nextDouble();
            
            soma = soma + notas[i]; // ou soma += notas[i]  
        }
        
        media = soma / notas.length;
        System.out.println("A média da turma é: " + media);
        
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= media ) {
                System.out.println("Notas dos alunos acima da média: " + notas[i]);
                contAlunosMaior++;
            }
        }
        System.out.println("Quantidade dos alunos acima da média: " + contAlunosMaior);
    }
}