package br.edu.ifrn.sc.peoo.aula11.parte1.aereotransportador;

public class Ave implements Aereo{

    @Override
    public void voa() {
        System.out.println("Bate as asas bem forte!");
    }

    @Override
    public void aterrisa() {
        System.out.println("Bate as asas mais fraco e põe as patas no chão");
    }
    
    
}
