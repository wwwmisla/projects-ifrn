package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome= leia.nextLine();
        
        System.out.println("Digite a sua idade: ");
        int idade= leia.nextInt();
        
        System.out.println("Nome: " + nome + "\nIdade: " + idade );
        
        if(idade >= 5 && idade <= 10){
            System.out.println("Categoria: Infantil");
        }
        if(idade >= 11 && idade <= 15){
            System.out.println("Categoria: Juvenil");
        }
        if(idade >= 16 && idade <= 20){
            System.out.println("Categoria: Júnior");
        }
        if(idade >= 21 && idade <= 25){
            System.out.println("Categoria: Profissional");
        }     
        if(idade < 5 || idade > 25 ){
            System.out.println("Categoria inexistente");
        }
    }
}
