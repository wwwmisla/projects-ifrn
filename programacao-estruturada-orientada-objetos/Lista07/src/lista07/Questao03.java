package lista07;

/*
Escreva um programa contendo uma função que recebe como parâmetro o raio de
um círculo (tipo de dados real) e retorna a área do círculo (π * raio2) 
como resultado (tipos de dados real). Utilise a função Math.pow() na resolução.
 */
public class Questao03 {

    public static void main(String[] args) {
        System.out.println("----- ÁREA DO CÍRCULO -----");

        double resultado = areaCirculo(6.0);

        System.out.println("Resultado: " + resultado);
    }
    
    public static double areaCirculo(double raio) {
        double a = 3.14 * Math.pow(raio, 2.0);

        return a;
    } 
}
