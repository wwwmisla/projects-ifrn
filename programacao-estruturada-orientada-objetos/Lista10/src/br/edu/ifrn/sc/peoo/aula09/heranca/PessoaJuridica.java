package br.edu.ifrn.sc.peoo.aula09.heranca;

public class PessoaJuridica extends Pessoa{
    
    private String CNPJ, inscrEstadual, inscrMunicipal;

    public PessoaJuridica() {
        super();
        System.out.println("PESSOA JURIDICA");
    }

    public PessoaJuridica(String CNPJ, String inscrEstadual, String inscrMunicipal, String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        System.out.println("PESSOA JURIDICA");
        this.CNPJ = CNPJ;
        this.inscrEstadual = inscrEstadual;
        this.inscrMunicipal = inscrMunicipal;
    }
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getInscrEstadual() {
        return inscrEstadual;
    }

    public void setInscrEstadual(String inscrEstadual) {
        this.inscrEstadual = inscrEstadual;
    }

    public String getInscrMunicipal() {
        return inscrMunicipal;
    }

    public void setInscrMunicipal(String inscrMunicipal) {
        this.inscrMunicipal = inscrMunicipal;
    }
   
}
