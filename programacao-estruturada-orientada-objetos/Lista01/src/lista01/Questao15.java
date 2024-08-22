package lista01;
//Misla Wislaine Alves da Silva - 21/01/2021

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numeroSegundos=leia.nextInt(); // número em segundos
        
        // Fazer as operações com números inteiros para não ter casas decimais.
        int umDia=86400; // Segundos em um dia
        int hora=3600; // Segundos em uma hora
        int min=60; // Segundos em um minuto
        
        int dias=numeroSegundos/umDia;
    /* O resultado da divisão entre o número em segundos por segundos em um dia
    dará o resultado em dias*/ 
        
        int horas=numeroSegundos/hora;
    /* O resultado da divisão entre o número em segundos por segundos em uma hora
    dará o resultado em horas*/
        
        int minutos=numeroSegundos%min;
    /* O resto da divisão de número em segundos por segundos em um minuto dará o 
    valor em minutos*/
    
        int segundos=minutos%min;
    /* O resto da divisão de minutos sobre segundos em um minutos(min) dará o resultado 
    em segundos*/
        
        System.out.println(dias + " dias, " + horas + " horas, " 
        + minutos + " minutos e " + segundos + " segundos");
    }
}
