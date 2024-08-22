package br.edu.ifrn.sc.peoo.aula10.atividade1;

public class Funcionario {

   protected String nome, cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    public double calculoSalario(){
        return salario;
    } 
    
}
