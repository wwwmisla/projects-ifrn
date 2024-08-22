package lista07;
/*Escreva um programa contendo como funções as quatro operações de uma
calculadora: soma, subtração, multiplicação e divisão. Cada função recebe como
parâmetros valores reais e deve retornar um resultado que também é do tipo real.*/
public class Questao01 {

    public static void main(String[] args) {

        System.out.println("----- CONTAS -----");

        double resultado = imprimeSoma(6.0, 6.0); //Aplicação (uso) da função imprimeSoma()

        System.out.println("Soma: " + resultado);

        double resultado2 = imprimeSubtracao(6.0, 6.0); //Aplicação (uso) da função imprimeSubtracao()

        System.out.println("Subtração: " + resultado2);

        double resultado3 = imprimeMultiplicacao(6.0, 6.0); //Aplicação (uso) da função imprimeMultiplicacao()

        System.out.println("Multiplicação: " + resultado3);

        double resultado4 = imprimeDivisao(6.0, 6.0); //Aplicação (uso) da função imprimeDivisao()

        System.out.println("Divisão: " + resultado4);
    }

    public static double imprimeSoma(double a, double b) { //Definição da função
        double soma = a + b;
        return soma; //soma
    }

    public static double imprimeSubtracao(double a, double b) { //Definição da função
        double subtracao = a - b;
        return subtracao; //subtração
    }

    public static double imprimeMultiplicacao(double a, double b) { //Definição da função
        double multiplicacao = a * b;
        return multiplicacao; //multiplicação
    }

    public static double imprimeDivisao(double a, double b) { //Definição da função
        double divisao = a / b;
        return divisao; //divisão
    }
}
