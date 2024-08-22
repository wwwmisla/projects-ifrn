package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de maçãs comprada: ");
        int maca= leia.nextInt();
        
        double macaComDesconto= 0.25 * maca;
        double macaSemDesconto= 0.30 * maca;
        
        if(maca >= 12){
            System.out.println("O valor total é: " + macaComDesconto);
        }
        if(maca < 12 ){
            System.out.println("O valor total é: " + macaSemDesconto);
        }
    }    
}
