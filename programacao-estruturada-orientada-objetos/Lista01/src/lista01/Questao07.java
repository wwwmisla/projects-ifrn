package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a nota da prova escrita: ");
        double provaEscrita=leia.nextDouble();
        
        System.out.println("Digite a nota da prova de desempenho: ");
        double provaDesempenho=leia.nextDouble();
        
        System.out.println("Digite a nota da prova de títulos: ");
        double provaTitulos=leia.nextDouble();
        
        double notaFinal= (0.4*provaEscrita) + (0.4*provaDesempenho) + (0.2*provaTitulos);
        /*Peso de cada prova vezes a nota obtida, somando então os 
        resultados de cada prova para chegar na nota final.*/
        
        System.out.println("Sua nota final é: " + notaFinal);
    }
}
