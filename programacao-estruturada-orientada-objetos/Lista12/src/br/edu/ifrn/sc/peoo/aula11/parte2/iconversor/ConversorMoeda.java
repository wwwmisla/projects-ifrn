package br.edu.ifrn.sc.peoo.aula11.parte2.iconversor;

public class ConversorMoeda implements IConversor{

    private double real = 4.60;

    public ConversorMoeda() {
    }

    public ConversorMoeda(double real) {
        this.real = real;
    }
    
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    
    @Override
    public double converter(double euro) {
        return euro / real;
    }
}
