package br.edu.ifrn.sc.peoo.aula10.atividade2;

public class Diretor extends Funcionario{

    public Diretor() {
        System.out.println("Construtor padrão do Diretor");
    }
    
    @Override
    public double calculoSalario() {
        return super.getSalario() * 5.0; 
    }
}
