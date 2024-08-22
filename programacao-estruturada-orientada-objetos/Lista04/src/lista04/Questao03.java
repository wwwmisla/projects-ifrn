package lista04;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int contadorPares=0;
        
        int[] vetor= new int [20];
        
        for (int i = 0; i < vetor.length; i ++){
		System.out.println("Digite um número: ");
		vetor[i] = leia.nextInt();
               
	}
        for(int i =0; i < vetor.length; i++){
            if(vetor[i] % 2 ==0){
                contadorPares++;
                System.out.println("Número par: " + vetor[i]);
            }
        }
        System.out.println("A quantidade de números pares no vetor era: " + contadorPares);
    }
}
