package br.edu.ifrn.sc.peoo.aula09.relacionamentoobj;

public class Dependente {

    private String nome;
    private int idade;

    public Dependente() {
    }

    public Dependente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("----- DEPENDENTE -----\n");
        sb.append("Nome: ");
        sb.append(nome);
        sb.append(", Idade: ");
        sb.append(idade);
        sb.append(" anos");

        return sb.toString();
    }

}
