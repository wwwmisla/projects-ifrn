package Lista06;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String texto=leia.nextLine();
		
		String[] vetor=texto.split(" ");
		
		System.out.println("Palavras com as iniciais das palavras");
		for (int i = 0; i < vetor.length; i++) {
			char primeiro = vetor[i].charAt(0);
			System.out.print(primeiro);
		}
		
	}

}
