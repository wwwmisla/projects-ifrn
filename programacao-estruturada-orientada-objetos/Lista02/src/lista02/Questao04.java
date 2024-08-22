package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021 e 22/01/2021

// OBS: Refiz a questão 04 depois da aula para encontrar meu erro, pois estava errando na linha 24(primeiro else if)

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int numero1= leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int numero2= leia.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        int numero3= leia.nextInt();
        
        if(numero1 < numero2 && numero2 < numero3 ){
            System.out.println("Ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
        }
        else if(numero1 < numero2 && numero3 < numero2 && numero3 > numero1){
            System.out.println("Ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
        }
        else if(numero2 < numero1 && numero1 < numero3){
            System.out.println("Ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
        }
        else if(numero2 < numero3 && numero3 < numero1){
            System.out.println("Ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
        }
        else if(numero3 < numero1 && numero1 < numero2){
            System.out.println("Ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
        }
        else if(numero3 < numero2 && numero2 < numero1){
            System.out.println("Ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
        }
    }
}
