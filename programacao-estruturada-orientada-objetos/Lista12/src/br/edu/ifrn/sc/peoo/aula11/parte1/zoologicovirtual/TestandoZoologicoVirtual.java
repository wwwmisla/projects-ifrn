package br.edu.ifrn.sc.peoo.aula11.parte1.zoologicovirtual;

public class TestandoZoologicoVirtual {

    public static void cicloDeVida(Animal animal) {
        
        animal.nasca();
        animal.passeie();
        animal.durma();
    }
    
    public static void main(String[] args) {
        Zebra z1 = new Zebra(102,99);
        Animal z2 = new Zebra(101,107);
        Morcego m1 = new Morcego();
        Ornitorrinco o1 = new Ornitorrinco(25);
        
        cicloDeVida(z1);
        cicloDeVida(z2);
        cicloDeVida(m1);
        cicloDeVida(o1);
        
        /*z1.contaListras(); Funciona corretamente.
        z2.contaListras(); Não funciona, pois a classe Zebra está se "fantasiando" da interface Animal, 
        dessa forma como interfaces são tipos abstratas o método contaListras não funcionaria.*/
    }
}
