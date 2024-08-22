package br.edu.ifrn.sc.peoo.aula10.atividade2;

public class Professor extends Funcionario{

    public Professor() {
        System.out.println("Construtor padrão do Professor");
    }

    @Override
    public double calculoSalario() {
        return super.getSalario() * 3.0;
    }
    
    
}
