package br.edu.ifrn.sc.peoo.aula10.atividade2;

public class Estagiario extends Funcionario{

    public Estagiario() {
        System.out.println("Construtor padrão do Estagiário");
    }

    @Override
    public double calculoSalario() {
        return super.getSalario() / 2.0; 
    }
    
    
}
