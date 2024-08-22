package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite a quantidade de coxinhas: ");
        int qCoxinhas=leia.nextInt();
        
        System.out.println("Digite a quantidade de pastéis: ");
        int qPasteis=leia.nextInt();
        
        System.out.println("Digite a quantidade de refrigerantes: ");
        int qRefrigerantes=leia.nextInt();
        
        double vCoxinha= qCoxinhas * 1.75;
        double vPasteis= qPasteis * 1.50;
        double vRefrigerantes= qRefrigerantes * 2.50;
        
        double valorPago=vCoxinha + vPasteis + vRefrigerantes;
        double valorReferente= valorPago*0.05; // 5/100=0,05
        
        System.out.println("Valor total pago pelo lanche: " + valorPago + "R$");
        System.out.println("Valor referente a 5% sobre o total do lanche: " + valorReferente);
    }
}
