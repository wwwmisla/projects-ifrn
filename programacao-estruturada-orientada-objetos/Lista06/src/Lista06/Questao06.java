package Lista06;

public class Questao06 {

	public static void main(String[] args) {

		String palavra ="ALECRIM";
		char[] vetor = palavra.toCharArray();
		
		System.out.println("Caracteres da palavras ALECRIM:");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
		}
	}

}
