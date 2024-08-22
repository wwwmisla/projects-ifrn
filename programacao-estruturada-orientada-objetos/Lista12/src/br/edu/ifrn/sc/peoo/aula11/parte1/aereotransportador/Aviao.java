package br.edu.ifrn.sc.peoo.aula11.parte1.aereotransportador;

public class Aviao implements Aereo, TransportadorDePessoas{

    @Override
    public void voa() {
        System.out.println("Liga as turbinas e recolhe o trem de pouso");
    }

    @Override
    public void aterrisa() {
        System.out.println("Abaixa o trem de pouso e desce");
    }

    @Override
    public void entraPessoas() {
        System.out.println("Iniciando o procedimento de embarque...");
    }

    @Override
    public void saiPessoas() {
        System.out.println("Iniciando o procedimento de desembarque...");
    }
    
}
