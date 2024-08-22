package lista07;

/*
Escreva um programa contendo uma função que recebe como parâmetro o raio de
um círculo (tipo de dados real) e retorna o perímetro do círculo (2 * π * raio) como
resultado (tipo de dados real).
 */
public class Questao02 {

    public static void main(String[] args) {
        System.out.println("----- PERÍMETRO DO CÍRCULO -----");

        double resultado = raioCirculo(6.0);

        System.out.println("Resultado: " + resultado);
    }

    public static double raioCirculo(double raio) {
        double r = 2.0 * 3.14 * raio;

        return r;
    }
}
