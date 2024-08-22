package br.edu.ifrn.sc.peoo.aula09.relacionamentoobj;

public class Desenvolvedor {

    private String nome;
    private double salario;

    public Desenvolvedor() {

    }

    public Desenvolvedor(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("----- DESENVOLVEDOR -----\n");
        sb.append("Nome: ");
        sb.append(nome);
        sb.append(", Salário: ");
        sb.append(salario);
        sb.append(" reais");

        return sb.toString();
    }

}
