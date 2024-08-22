package br.edu.ifrn.sc.peoo.aula11.parte2.iconversor;

public class ConversorMedida implements IConversor{

    private double polegadas = 0.393701;

    public ConversorMedida() {
    }
    
    public ConversorMedida(double polegadas) {
        this.polegadas = polegadas;
    }
    
    public double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(double polegadas) {
        this.polegadas = polegadas;
    }
    
    @Override
    public double converter(double centrimetros) {
        return centrimetros * polegadas;
    }
}
