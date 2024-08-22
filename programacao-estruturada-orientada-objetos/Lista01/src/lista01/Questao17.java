package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        final double PI=3.14159;// variável constante 
        
        System.out.println("Digite o valor do raio: ");
        double raio=leia.nextDouble();
        
        System.out.println("Digite o valor da altura: ");
        double altura=leia.nextDouble();
        
        double areaL= 2*PI*raio*altura; //area lateral
        
        double areaB=PI* Math.pow(raio, 2); // area da base
        
        double areaT=areaL+areaB; // area total
        
        System.out.println("A área do cilíndro é: " + areaT);
        
        double volume= areaB*altura; // formula para achar volume 
        System.out.println("O volume do cilíndro é: " + volume);
    }
}
