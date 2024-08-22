package lista02;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
                
        /*System.out.println("Código       Campus");
        System.out.println("SC        IFRN/Santa Cruz");
        System.out.println("NC        IFRN/Nova Cruz");
        System.out.println("CNAT      IFRN/Natal Central");
        System.out.println("CANG      IFRN/Canguaretama");
        System.out.println("JC        IFRN/João Câmara\n"); Tabela rascunho*/
        
        System.out.println("Digite um dos código para saber o nome do campi: \n" 
        + " SC \n" + " NC \n" + "CNAT \n" + "CANG \n" + " JC ");
        
        String codigo= leia.nextLine();      
        String codigo1= codigo.toUpperCase();
    /* Caso o usuário digite o mesmo código só que em minúscula, então será transformada em maiúscula*/

        switch(codigo1)
        {
            case "SC":
                System.out.println("IFRN/Santa Cruz");
                break;
            case "NC":
                System.out.println("IFRN/Nova Cruz");
                break;
            case "CNAT":
                System.out.println("IFRN/Natal Central");
                break;
            case "CANG":
                System.out.println("IFRN/Canguaretama");
                break;
            case "JC":
                System.out.println("IFRN/João Câmara");
                break;
            default:
                System.out.println("Campus Inexistente");
                break;
        }
    }
}
