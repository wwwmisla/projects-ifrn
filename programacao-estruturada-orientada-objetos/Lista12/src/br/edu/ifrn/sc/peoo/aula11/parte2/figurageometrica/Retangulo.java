package br.edu.ifrn.sc.peoo.aula11.parte2.figurageometrica;

public class Retangulo implements FiguraGeometrica{

    private int base, altura;

    public Retangulo() {
    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public int calcularPerimetro() {
       return (base * 2) + (altura * 2); 
    }
    
}
