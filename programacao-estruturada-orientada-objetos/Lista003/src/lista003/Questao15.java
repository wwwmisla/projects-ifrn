package lista003;

import java.util.Random;
import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random ale = new Random(); 
        int numeroAle= 0+ale.nextInt(1000);
        
        boolean acertou = false;
        int chute=0;
        
        System.out.println("Tente adivinhar o número sorteado que está entre 0 e 1000 ");
        System.out.println("Caso queira desistir digite um número maior que 1000 ");
        
        while(acertou == false){
            System.out.println("\nDigite um número inteiro entre 0 e 1000: ");
            chute = leia.nextInt();
            
            if(chute > 1000){
                System.out.println("Você desistiu! ");
                break;
            }
            if(chute < numeroAle){
                System.out.println("O número que você escolheu é menor do que o número sorteado\n");
            }
            if(chute > numeroAle){
                System.out.println("O número que você escolheu é maior do que o número sorteado\n");
            }
            if(chute == numeroAle){
                System.out.println("Parabéns, Você acertou o número!!!");
                acertou = true;
            }
        }
    }
}
