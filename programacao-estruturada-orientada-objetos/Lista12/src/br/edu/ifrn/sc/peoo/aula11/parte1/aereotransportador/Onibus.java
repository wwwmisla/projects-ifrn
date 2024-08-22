package br.edu.ifrn.sc.peoo.aula11.parte1.aereotransportador;

public class Onibus implements TransportadorDePessoas{

    @Override
    public void entraPessoas() {
        System.out.println("Abre as portas e entram as pessoas");
    }

    @Override
    public void saiPessoas() {
        System.out.println("Abre as portas e saem as pessoas");
    }
    
}
