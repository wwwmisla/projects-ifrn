package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        double valorProduto=leia.nextDouble();
        
        System.out.println("Digite a quantidade de parcelas desejada: ");
        int qParcelas=leia.nextInt();
        
        double vParcela=valorProduto/qParcelas;
        double multa=vParcela*0.02;// (2/100)=0.02
        
        System.out.println("Valor da parcela é: " + vParcela + "R$");
        System.out.println("Valor da multa é: " + multa + "R$");
    }
}
