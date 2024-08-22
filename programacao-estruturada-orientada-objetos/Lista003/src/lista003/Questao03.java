package lista003;

public class Questao03 {

    public static void main(String[] args) {
        System.out.println("Números naturais positivos divisíveis por 4 e que são menores ou igual 1000: ");
        
        for (int i = 1; i <= 1000; i++) {
            if(i % 4 == 0 ){
                System.out.println(i);
                i++;
            }
        }
    }
}
