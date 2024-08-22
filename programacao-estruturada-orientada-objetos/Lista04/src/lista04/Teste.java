/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

import java.util.Scanner;

/**
 *
 * @author wwwmisla
 */
public class Teste {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número em segundos:");
        int duracao = leia.nextInt();

        int hora = duracao / 3600;
        int horaR = duracao % 3600;
        int minuto = horaR / 60;
        int minutoR = horaR % 60;
        int segundos = minutoR;

        String horasS = Integer.toString(hora);
        String minutosS = Integer.toString(minuto);
        String segundosS = Integer.toString(segundos);

        String ret = horasS + ":" + minutosS + ":" + segundosS;

        System.out.println(ret);
    }
}
