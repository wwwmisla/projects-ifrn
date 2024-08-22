package Lista06;

public class Questao08 {

	public static void main(String[] args) {
		 
		String frase = "Aprender JAVA é muito bom!";
		String[] vetor = frase.split(" ");
		
		System.out.println("vetor com cada palavra da frase: "+frase);
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
