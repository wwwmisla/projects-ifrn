package Lista06;

public class Questao03 {

	public static void main(String[] args) {

		String palavra = "ABRACADABRA";
		char[] vetor = palavra.toCharArray();
		
		System.out.println("Ordem inversa da palavra ABRACADABRA:");
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.print(vetor[i]);
		}
	}

}
