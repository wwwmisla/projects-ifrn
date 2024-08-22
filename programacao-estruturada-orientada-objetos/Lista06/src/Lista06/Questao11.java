package Lista06;

public class Questao11 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		sb.append("ABRACADABRA");
		sb.delete(4, 8);
		String textoFinal = sb.toString();
		
		System.out.println("Remoção da parte CADA da palavra ABRACADABRA:");
		System.out.println(textoFinal);

	}

}
