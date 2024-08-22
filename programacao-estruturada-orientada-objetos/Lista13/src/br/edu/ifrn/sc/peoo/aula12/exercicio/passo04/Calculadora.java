package br.edu.ifrn.sc.peoo.aula12.exercicio.passo04;

public class Calculadora {

    public static int divisao(int num, int den) throws DivideByZeroException {

        if (den != 0) {
            return num / den;
            
        } else {
            throw new DivideByZeroException("Divisão por zero!");

        }
    }
}
