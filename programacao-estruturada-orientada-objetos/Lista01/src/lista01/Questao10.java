package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite o saldo da sua conta bancária: ");
        double saldoBancario=leia.nextDouble();
        
        double novoSaldo= saldoBancario + 7.5; 
    // ou saldoBancario + (saldoBancario * 7.5) /100 
    
        System.out.println("Seu antigo saldo bancário é: " + saldoBancario + "R$");
        System.out.println("Seu novo saldo bancário é: " + novoSaldo + "R$");
    }
}
