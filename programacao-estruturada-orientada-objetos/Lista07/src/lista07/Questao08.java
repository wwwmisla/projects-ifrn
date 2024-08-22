package lista07;

/**
 * Escreva um programa contendo uma função que recebe como parâmetro um vetor de
 * String e imprime todos os seus elementos de forma invertida.
 */
public class Questao08 {

    public static void main(String[] args) {
        String a = "Misla Wislaine";

        System.out.println("String ao contrário: ");
        vetor(a);
        
    }

    public static void vetor(String a) {
        char[] vetor = a.toCharArray();
        
        for (int i= vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i]);
        }
    }
}
