package br.edu.ifrn.sc.peoo.aula10.atividade1;

public class Diretor extends Funcionario{

    public Diretor() {
        System.out.println("Construtor padrão do Diretor");
    }
    
    @Override
    public double calculoSalario() {
        return super.calculoSalario() * 5.0; 
    }
    
}
