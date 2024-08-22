package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a base do triângulo: ");
        int base=leia.nextInt();
        
        System.out.println("Digite a altura do triângulo: ");
        int altura=leia.nextInt();
        
        double area=(base*altura)/2;
        System.out.println("A área do triângulo é: " + area);
    }
}
