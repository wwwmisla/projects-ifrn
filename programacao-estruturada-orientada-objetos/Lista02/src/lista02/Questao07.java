package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o valor do seu salário: ");
        double salario= leia.nextDouble();
        
        System.out.println("O valor do seu antigo salário é: " + salario + "R$");
        
        if(salario < 1500){
            double aumento= salario * 0.15;
            double novoSalario= aumento + salario;
            
            System.out.println("O valor do seu novo salário é: " + novoSalario + "R$");
            System.out.println("Seu aumento foi de: " + aumento + "R$");
        }
        if(salario >= 1500 && salario < 1750){
            double aumento1= salario * 0.12;
            double n1= aumento1 + salario;
            
            System.out.println("O valor do seu novo salário é: " + n1 + "R$");
            System.out.println("O seu aumento é: " + aumento1 + "R$");    
        }
        if(salario >= 1750 && salario < 2000){
            double aumento2= salario * 0.10;
            double n2= aumento2 + salario;
            
            System.out.println("O valor do seu novo salário é: " + n2 + "R$");
            System.out.println("O seu aumento é: " + aumento2 + "R$");    
        }
        if(salario >= 2000 && salario < 3000){
            double aumento3= salario * 0.075;
            double n3= aumento3 + salario;

            System.out.println("O valor do seu novo salário é: " + n3 + "R$");
            System.out.println("O seu aumento é: " + aumento3 + "R$");    
        }
        if(salario >= 3000){
            double aumento4= salario * 0.05;
            double n4= aumento4 + salario;
            
            System.out.println("O valor do seu novo salário é: " + n4 + "R$");
            System.out.println("O seu aumento é: " + aumento4 + "R$");    
        }               
    }
}
