package br.edu.ifrn.sc.peoo.aula12.exercicio.passo03;

public class Calculadora {

    public static int divisao(int num, int den) throws ArithmeticException {

        if (den != 0) {
            return num / den;
            
        } else {
            throw new ArithmeticException("Divisão por zero!");

        }
    }
}
