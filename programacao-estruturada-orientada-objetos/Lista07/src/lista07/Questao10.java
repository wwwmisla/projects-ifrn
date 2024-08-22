package lista07;

import java.util.Scanner;
/*
Escreva um programa contendo uma função que recebe como parâmetros um vetor
de reais e um elemento a ser procurado (do tipo real) e informa a posição do
elemento dentro do vetor (retorna -1 caso o número não esteja dentro do vetor).
*/
public class Questao10 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float valor[] = {3f,6.66f,2.6f,15f,7.3f}; 
        
        System.out.println("Digite um valor para ser procurado:");
        float v= leia.nextFloat();
        
        System.out.println(verifica(valor,v));
    }
    public static int verifica(float[] a, float b){
        int posicao = -1;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                posicao = i;
            }
        }
        return posicao;
    }
}
