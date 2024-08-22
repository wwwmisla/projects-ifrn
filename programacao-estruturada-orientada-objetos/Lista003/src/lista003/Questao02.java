package lista003;

public class Questao02 {

    public static void main(String[] args) {
        System.out.println("Múltiplos de 7 menores que 2000:"); // Indicação da saída
        
        for (int i = 1; i < 2000; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
