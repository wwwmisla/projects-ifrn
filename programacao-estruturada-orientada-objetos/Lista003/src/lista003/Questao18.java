package lista003;

public class Questao18 {

    public static void main(String[] args) {
        int numero7 = 0;
        int numero21 = 0;
        
        
        int contPrimo = 1;
        int numero = 3;

        boolean investigacao = true;
        

        while (investigacao == true) {
            
            int contador = 0;
            
            for (int i = 1; i <= numero; i++) {
                if (numero % i ==0) {
                    contador++;
                }
            }
            if(contador == 2){
                contPrimo = contPrimo + 1;
                if(contPrimo == 7){
                    numero7= numero;
                }
                else if(contPrimo ==21 ){
                    numero21 = numero;
                    investigacao = false;
                }
            }
            numero += 2;
        }
        int diferenca= numero21 - numero7; // numero7= 17 e numero21=73 
        System.out.println("Diferença primos: \n" + numero21 + " - " + numero7 + " = " + diferenca);
    }
}
