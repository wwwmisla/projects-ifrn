package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        /*System.out.println("Código   Item     Preço unitário");
        System.out.println(" 200    Chuteira  R$ 159,99");
        System.out.println(" 301    Meião     R$ 14,99");
        System.out.println(" 102    Camiseta  R$ 59,99");
        System.out.println(" 403    Calção    R$ 29,99");
        // Opção para tabela */ 
        
        System.out.println("Código  Item    Preço unitário\n" +
    " 200   Chuteira  R$ 159,99\n" + " 301   Meião     R$ 14,99\n" +
    " 102   Camiseta  R$ 59,99\n" + " 403   Calção    R$ 29,99");
        /* Essa alternativa pode ser confusa e desorganizada, contudo é a mais 
        econômica em termos de linha*/
        
        System.out.println("\nDigite um dos códigos da tabela: ");
        int codigo= leia.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade= leia.nextInt();
        
        switch(codigo)
        {
            case 200:
                double valorChuteira= quantidade * 159.99;
                System.out.println("Compra realizada com sucesso! O seu valor total é: " + valorChuteira + "R$");               
                break;
                
            case 301:
                double valorMeiao= quantidade * 14.99;
                System.out.println("Compra realizada com sucesso! O seu valor total é: " + valorMeiao + "R$");
                break;
                
            case 102: 
                double valorCamiseta= quantidade * 59.99;
                System.out.println("Compra realizada com sucesso! O seu valor total é: " + valorCamiseta + "R$");
                break;
                
            case 403: 
                double valorCalcao= quantidade * 29.99;
                System.out.println("Compra realizada com sucesso! O seu valor total é: " + valorCalcao + "R$");
                break;
                
            default:
                System.out.println("Código não encontrado, tente de novo!");
                break;
        }
    }       
}
