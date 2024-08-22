package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao23 {
     public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int idade=leia.nextInt();
        
        // OBS: Declarar variáveis como tipo inteiro para eliminar as casas decimais
        
        int anos=365;
        int mes=30;
        int dias=30;
        
        int anosT=idade/anos;
        // Com esse cálculo conseguiremos o resultado em anos.
        
        int meses=(idade%anos)/mes;
        /*Com o resto da divisão entre idade e ano, conseguiremos dividir pela quantidade 
        de dias em 1 mês, dando como resultado os meses.*/  
    
        int diasT=(idade%anos)%dias;
    /*Com o resto da divisão entre idade e ano, conseguiremos então o resto 
    do mês, chegando então ao resultado de dias*/    
        
        System.out.println(anosT + " ano(s) \n" + meses 
                +" mês(es) \n" + diasT + " dia(s) " );
    }
}
