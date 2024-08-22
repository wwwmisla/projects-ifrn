package lista003;

import java.util.Random;

public class Questao14 {

    public static void main(String[] args) {
        Random numeroAle = new Random();
        
        for (int n = 1; n <= 20; n++) {
            int a = 0+numeroAle.nextInt(3001);
      
            if (a % 11 == 5) {
                System.out.println("Números que são divisiveis por 11 e o resto é igual a 5: \n" + a);
            } 
        }
    }
}
