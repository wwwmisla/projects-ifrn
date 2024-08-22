package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite um valor em quilogramas: ");
        double valorKg=leia.nextDouble();        
        
        double valorLibras=valorKg*2.2; 
         
        System.out.println("Valor em libras: " + valorLibras + " libras");
    }
}
