package lista003;

public class Questao09 {

    public static void main(String[] args) {
        int numero=0;
        int media=0;
        int soma=0;
        
        for(int i=12; i <= 873; i++){
            soma += i;
            if( numero % 2 ==0){
                media= soma / i;
            }
        }
        System.out.println("A média dos números pares entre 12 e 873 é: " + media); 
    }
}
