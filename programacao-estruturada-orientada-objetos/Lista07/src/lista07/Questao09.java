package lista07;

import java.util.Scanner;
/*
Escreva um programa contendo uma função que recebe como parâmetros um vetor
de reais e um elemento a ser procurado (do tipo real) e informa se o elemento se
encontra dentro do vetor (retorno é do tipo boolean).
*/
public class Questao09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float valor[]= {1.9f,6f,9f,12.15f,18.7f};
        
        System.out.println("Digite um valor para ser encontrado:");
        float v = leia.nextFloat();
        
        System.out.println(verifica(valor,v));
        
    }
    public static boolean verifica(float[] a, float b){
        boolean mw = false;
        
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                mw = true;
            }
        }
        return mw;
    }
}
