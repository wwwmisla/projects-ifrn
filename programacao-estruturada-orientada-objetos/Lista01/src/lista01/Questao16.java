package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite a quantidade de anos que você fuma: ");
        int anosFumando=leia.nextInt();
        
        System.out.println("Digite a quantidade de cigarros fumados ao dia: ");
        int cigarrosFumados=leia.nextInt();
        
        System.out.println("Digite o preço de uma carteira com 20 cigarros: ");
        double precoCarteira=leia.nextDouble();
        
        int anos= anosFumando * 365;
        
        int cigarros= cigarrosFumados * anos;
        
        double dinheiroGasto = precoCarteira* (cigarros / 20.0);
        
        System.out.println("A quantidade de dinheiro gasto é: " + dinheiroGasto + "R$");
    }
}
