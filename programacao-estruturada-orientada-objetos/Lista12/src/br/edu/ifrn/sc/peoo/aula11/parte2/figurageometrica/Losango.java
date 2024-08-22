package br.edu.ifrn.sc.peoo.aula11.parte2.figurageometrica;

public class Losango implements FiguraGeometrica {

    private int lado;

    public Losango() {
    }

    public Losango(int lado) {
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularPerimetro() {
        return lado * 4;
    }

}
