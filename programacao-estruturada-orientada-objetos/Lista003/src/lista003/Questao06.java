package lista003;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite um número para que seja calculado seu fatorial: ");
        int n= leia.nextInt();
        
        int fatorial=1;
        
        for(int i=1; i <= n; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial do número é: " + fatorial);
        
    }
}
