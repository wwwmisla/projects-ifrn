package br.edu.ifrn.sc.peoo.aula11.parte1.zoologicovirtual;

public class Morcego implements Animal{

    @Override
    public void nasca() {
        System.out.println("Nasce um lindo morcego");
    }

    @Override
    public void passeie() {
        System.out.println("Voa de um lado para o outro");
    }

    @Override
    public void durma() {
        System.out.println("Dorme de cabeça para baixo");
    }

    @Override
    public double peso() {
        return 4.5;
    }
}
