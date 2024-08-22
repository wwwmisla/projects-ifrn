package br.edu.ifrn.sc.peoo.aula10.atividade2;

public abstract class Funcionario {
    protected String nome, CPF;
    protected double salario;

    public Funcionario() {
        System.out.println("Construtor padrão do Funcionário");
        
        this.salario = 2000.00;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calculoSalario();
    
}
