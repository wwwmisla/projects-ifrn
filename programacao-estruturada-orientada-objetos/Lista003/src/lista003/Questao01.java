package lista003;

public class Questao01 {

    public static void main(String[] args) {
        int num= 0; // número
        int fim=0; // resultado final
        
        for(int m=0; m < 500; m++){ 
            num++;
            fim += num;
            
        }
        System.out.println("O resultado da soma é: " + fim);
    }
}
