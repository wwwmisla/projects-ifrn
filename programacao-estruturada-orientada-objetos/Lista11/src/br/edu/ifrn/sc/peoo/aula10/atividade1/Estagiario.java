package br.edu.ifrn.sc.peoo.aula10.atividade1;

public class Estagiario extends Funcionario {

    public Estagiario() {
        System.out.println("Construtor padrão do Estagiário");
    }

    @Override
    public double calculoSalario() {
        return super.calculoSalario() / 2.0; 
    }   
}
