package br.edu.ifrn.sc.peoo.aula12.exercicio.passo04;

public class TesteCalculadora {

    public static void main(String[] args) {

        System.out.println("Antes da divisão");

        try {
            System.out.println(Calculadora.divisao(2, 0));
        } 
        catch (DivideByZeroException dbzex) {
            System.out.println(dbzex.getMessage());
        }
        
        System.out.println("Depois da divisão");

    }
}
