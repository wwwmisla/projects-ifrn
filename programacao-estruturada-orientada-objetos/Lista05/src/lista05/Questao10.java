package lista05;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {
        Scanner leia= new Scanner(System.in);
        
        double[][] matriz = new double[5][7];
        
        System.out.println("Digite os valores dos elementos da matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.print("Posição [" + i + "] [" + j + "] = ");
                matriz[i][j] = leia.nextDouble();
                
            }
        }
        
        System.out.print("\n");
        double produto = 1;
        int contNegativos = 0;
        //Alternativas A,D e E
        for (int i = 0; i < matriz.length; i++) {
            
            double maior = matriz[i][0];
            
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
                if(matriz[i][j] != 0){
                    produto = produto * matriz[i][j];
                }
                if(matriz[i][j] < 0){
                    contNegativos++;
                }
            }
            System.out.println("O maior valor da linha " + (i+1) + " é: " + maior);
        }
        
        System.out.print("\n");
        //Alternativas B e C
        for (int i = 0; i < matriz[0].length; i++) {
            
            double maior = matriz[0][i];
            double somaColunas = 0;
            for (int j = 0; j < matriz.length; j++) {
                
                somaColunas = somaColunas + matriz[j][i];
                
                if(matriz[j][i] > maior){
                    
                    maior = matriz[j][i];
                    
                }
            }
            System.out.println("O maior valor da coluna " + (i+1) + " é: " + maior);
            
            double mediaColunas = somaColunas / matriz.length;
            System.out.println("A média da coluna " + (i+1) + " é: " + mediaColunas);
        }
        
        System.out.println("\nO produto é: " + produto);
        System.out.println("A quantidade de números negativos é: " + contNegativos);
    }
}
