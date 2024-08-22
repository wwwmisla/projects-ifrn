package br.edu.ifrn.peoo.aula08.atividade3;

public class TesteCalculadora {

    public static void main(String[] args) {

        System.out.println("------ CALCULADORA ------");
        
        double resultadoSoma = Calculadora.soma(6.6, 6.6);

        System.out.println("Resultado da soma: " + resultadoSoma);
        
        double resultadoSubtracao = Calculadora.subtracao(6.6, 6.6);
        
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        
        double resultadoMultiplicacao = Calculadora.multiplicacao(6.6, 6.6);
        
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
        
        double resultadoDivisao = Calculadora.divisao(6.6, 6.6);
        
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}
