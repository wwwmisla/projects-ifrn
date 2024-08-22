package br.edu.ifrn.sc.peoo.aula09.heranca;

public class PessoaFisica extends Pessoa{
    
    private String CPF, RG, dataNascimento;

    public PessoaFisica() {
        super();
        System.out.println("PESSOA FÍSICA");
    }
         
    public PessoaFisica(String CPF, String RG, String dataNascimento, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        System.out.println("PESSOA FÍSICA");
        this.CPF = CPF;
        this.RG = RG;
        this.dataNascimento = dataNascimento;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
