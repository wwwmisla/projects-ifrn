package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double valorJardas=leia.nextDouble();
        
        double valorMetros=valorJardas*0.91;//conversao jardas p/ metros
        
        System.out.println("Valor em metros: " + valorMetros + "m");
    }
}
