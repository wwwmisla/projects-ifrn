package br.edu.ifrn.sc.peoo.aula11.parte1.aereotransportador;

public class TestandoAereoTransportador {
    
    public static void voar(Aereo obj){
        
        obj.voa();
    }
    public static void main(String[] args) {
        
        Aereo obj1 = new Aviao();
        Aereo obj2 = new Ave();
        
        voar(obj1);
        voar(obj2);
        
        obj1.aterrisa();
        TransportadorDePessoas obj3 = (TransportadorDePessoas) obj1;
        /*Funciona corretamento.*/
        obj3.saiPessoas();
        
    }
}
