package lista04;

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int[] dado= new int[6];
        int n=0; // número lido
        
        int lado1 =0;
        int lado2 =0;
        int lado3 =0;
        int lado4 =0;
        int lado5 =0;
        int lado6 =0;
        
        int faces =0;
        
        System.out.println("Digite o número de vezes que o dado caiu: ");
        n=leia.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Digite o número da face que caiu na sua jogada: ");
            dado[faces] =leia.nextInt();
            
            if(dado[faces] == 1){
                lado1++;
            }
            if(dado[faces] == 2){
                lado2++;
            }
            if(dado[faces] == 3){
                lado3++;
            }
            if(dado[faces] == 4){
                lado4++;
            }
            if(dado[faces] == 5){
                lado5++;
            }
            if(dado[faces] == 6){
                lado6++;
            }
        }
        System.out.println("O número de ocorrências para cada face será: ");
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Lado 4: " + lado4);
        System.out.println("Lado 5: " + lado5);
        System.out.println("Lado 6: " + lado6);
    }
}
