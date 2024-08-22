package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
       Scanner leia= new Scanner(System.in); 
       
       System.out.println("Digite seu primeiro número: ");
       double numero1= leia.nextDouble();
       
       System.out.println("Digite seu segundo número: ");
       double numero2= leia.nextDouble();
       
       System.out.println("Digite seu terceiro número: ");
       double numero3= leia.nextDouble();
       
       double media= (numero1 + numero2 + numero3)/3; //atalho para dar preferência a soma
        System.out.println("Sua média é: " + media);
    }
    
}
