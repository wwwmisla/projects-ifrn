package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero= leia.nextInt();
        
        if(numero >= 0 && numero <= 100){
            System.out.println("Você digitou um número entre 0 e 100");
        } 
        else{
            System.out.println("Você digitou um número fora do intervalo entre 0 e 100");
        }
    }
}
