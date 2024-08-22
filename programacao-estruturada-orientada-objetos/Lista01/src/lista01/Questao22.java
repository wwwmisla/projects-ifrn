package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;
import java.text.DecimalFormat;

public class Questao22 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número para X1: ");
        float x1=leia.nextFloat();
        
        System.out.println("Digite um número para Y1: ");
        float y1=leia.nextFloat();
        
        System.out.println("Digite um número para X2: ");
        float x2=leia.nextFloat();
        
        System.out.println("Digite um número para Y2: ");
        float y2=leia.nextFloat();       
        
        double distancia= Math.sqrt (Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
        /* Com essa operação conseguimos primeiro subtrair e elevar as variáveis a segunda potência, 
        segundo somamos o resultado da substração, logo com o resultado da soma, conseguimos extrair a raiz. */
        
        DecimalFormat decimal= new DecimalFormat("0.0000");// Para definir a quantidade de casas decimais     
        
        System.out.println("A distância é: " + decimal.format(distancia)); 
    }
}
