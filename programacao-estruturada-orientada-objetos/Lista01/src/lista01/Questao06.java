package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o tempo gasto em sua viagem: ");
        double tempo=leia.nextDouble();
        
        System.out.println("Digite a velocidade média durante a viagem: ");
        double velocidade=leia.nextDouble();
        
        double distancia= tempo * velocidade;
        double litrosUsados=distancia/12;
        
        System.out.println("A velocidade média é: " + velocidade + "Km/h");
        System.out.println("O tempo gasto na viagem é: " + tempo);
        System.out.println("A distância percorrida é: " + distancia + "Km");
        System.out.println("A quantidade de litros utilizada na viagem é: " + litrosUsados + "L");
    }
}
