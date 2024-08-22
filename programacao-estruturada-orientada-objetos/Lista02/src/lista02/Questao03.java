package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero= leia.nextInt();
             
        if((numero % 4 == 0 ) && (numero % 100 !=0) || (numero % 400 ==0) ){
            System.out.println("O ano é bissexto!");
        }
        else{
            System.out.println("O ano não é bissexto!");
        }
    }
}
