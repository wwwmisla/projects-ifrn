package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        double numero=leia.nextDouble();
        
        double potencia= Math.pow(numero, 5);// Função para encontrar o número na potencia.
        System.out.println("Número a 5º potência: " + potencia);
        
        double raizQuadrada=Math.sqrt(numero);// Função para encontrar a raiz quadrada de um número.
        System.out.println("Raiz quadrada: " + raizQuadrada);
    }
}
