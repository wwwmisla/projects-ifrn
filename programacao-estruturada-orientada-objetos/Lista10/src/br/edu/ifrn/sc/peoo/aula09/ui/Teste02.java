package br.edu.ifrn.sc.peoo.aula09.ui;

import br.edu.ifrn.sc.peoo.aula09.relacionamentoobj.Funcionario;
import br.edu.ifrn.sc.peoo.aula09.relacionamentoobj.Dependente;
import java.util.Scanner;

public class Teste02 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leia1 = new Scanner(System.in);
        
        //Objeto 1 Funcionário
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite a sua matrícula:");
        f1.setMatricula(leia.nextLine());
        
        System.out.println("Digite o seu nome:");
        f1.setNome(leia.nextLine());
        
        System.out.println("Digite o valor do seu salário:");
        f1.setSalario(leia1.nextDouble());
        
        //Objeto 1 Dependente
        
        System.out.println("Digite o nome do dependente:");
        String nome = leia.nextLine();
        
        System.out.println("Digite a idade do dependente:");
        int idade = leia1.nextInt();
        
        Dependente d1 = new Dependente(nome, idade);
        
        /////
        f1.setDependente(d1);
        
        /////
        System.out.println("----- FUNCIONÁRIO -----");
        System.out.print("Matrícula: " + f1.getMatricula());
        System.out.print(", Nome: " + f1.getNome());
        System.out.print(", Salário: " + f1.getSalario());
        System.out.println("\n" +  d1.toString());
    }
   
}
