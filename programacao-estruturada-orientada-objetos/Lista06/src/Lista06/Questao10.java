package Lista06;

public class Questao10 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		String frase = "Aprender JAVA � muito bom!";
		String[] vetor = frase.split(" ");

		System.out.println("Vetor da quest�o 8:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		String textoFinal = null;
		System.out.println("Concatena��o com StringBuilder:");
		for (int i = 0; i < vetor.length; i++) {
			sb.append(vetor[i] + " ");
			textoFinal = sb.toString();
		}

		System.out.println(textoFinal);
	}

}
