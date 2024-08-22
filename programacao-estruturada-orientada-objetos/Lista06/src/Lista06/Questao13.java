package Lista06;

import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		System.out.println("Digite um numero de telefone:");
		String numero = leia.next();
		
		if (numero.length() == 11) {
			System.out.println("Formatação do número:");
			sb.append("(").append(numero.substring(0, 2));
			sb.append(") ").append(numero.substring(2, 7));
			sb.append("-").append(numero.substring(7, 11));
			String numeroFinal = sb.toString();
			System.out.println(numeroFinal);
		} else {
			System.out.println("Impossível formatar");
		}

	}

}
