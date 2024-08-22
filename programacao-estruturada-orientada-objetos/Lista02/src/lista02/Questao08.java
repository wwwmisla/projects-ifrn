package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome= leia.nextLine();
        
        System.out.println("Digite a quantidade de diárias: ");
        int quantidade= leia. nextInt();
        
        int diaria= 130;
        
        System.out.println("Cliente: " + nome);
        
        if(quantidade >= 4 && quantidade <= 7){
            double n1= (quantidade * diaria) + 0.075;
            System.out.println("Total da conta: " + n1 + "R$");
        }
        if(quantidade >  7){
            double n2= (quantidade * diaria) + 0.05;
            System.out.println("Total da conta: " + n2 + "R$");
        }
        if(quantidade >= 2 && quantidade <= 3){
            double n3= (quantidade * diaria) + 0.1;
            System.out.println("Total da conta: " + n3 + "R$");
        }
        if(quantidade < 2){
            double n4= (quantidade * diaria) + 0.15;
            System.out.println("Total da conta: " + n4 + "R$");
        }
    }
}
