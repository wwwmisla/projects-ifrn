package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double numero1=leia.nextDouble();
        
        System.out.println("Digite um número: ");
        double numero2=leia.nextDouble();
        
        System.out.println("Dividendo: " + numero1);
        System.out.println("Divisor: " + numero2);
        
        double quociente= numero1/numero2; // O resultado da divisão será o quociente.
        double resto=numero1%numero2; // Resto da divisão.
        
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
