package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o valor mensal de seu plano de saúde: ");
        double valorMensal=leia.nextDouble();
        
        double valorReajustado= valorMensal + 0.11;//11% do valor mensal 11/100=0.11
        
        double vTotal=valorReajustado*12.0;// valor com o reajuste de 11%
        
        System.out.println("Valor total pago em 12 meses: " + vTotal + "R$");
    }
}
