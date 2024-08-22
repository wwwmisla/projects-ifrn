package br.edu.ifrn.sc.peoo.aula12.exercicio.passo02;

public class Calculadora {

    public static int dividir(int num, int den) {

        try {
            return num / den;
        } 
        catch (ArithmeticException aex) {
            System.out.println("A operação não pode ser realizada!");
            return 0;

        }
    }
}
