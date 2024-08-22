package lista003;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int m=0;
        
        int nquadrado;
        System.out.println("Digite um número inteiro: ");
        int numero= leia.nextInt();
        
        do{
            m++;
            nquadrado= numero*numero;
        } while(nquadrado <= m);
                System.out.println("O número é: " + nquadrado);
    }
}
