package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a nota da primeira prova: ");
        double nota1= leia.nextDouble();
        
        System.out.println("Digite a nota da segunda prova: ");
        double nota2= leia.nextDouble();
        
        System.out.println("Digite a nota da terceira prova: ");
        double nota3= leia.nextDouble();
        
        System.out.println("Digite o número de faltas: ");
        double faltas= leia.nextDouble();
        
        double media= (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média é: " + media);
        
        if(media >= 7 && faltas < 7){
            System.out.println("Aprovado!");
        }
        if(media >= 3 && media < 7 && faltas < 7){
            System.out.println("Recuperação!");
            
            System.out.println("Digite o valor da sua quarta prova: ");
            double nota4= leia.nextDouble();
            
            double mediaRecuperacao= (nota1 + nota2 + nota3 + nota4)/4;
            System.out.println("Média depois da recuperação: " + mediaRecuperacao);
        if(mediaRecuperacao >= 7 ){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado!");
        }
        }
        if(media < 3 || faltas >= 7){
            System.out.println("Reprovado!");
        }        
    }
}
