package br.edu.ifrn.sc.peoo.aula12.exercicio.passo04;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("Tentou realizar a divisão por 0!");
    }

    public DivideByZeroException(String mensagem) {
        super(mensagem);

    }
}
