package br.edu.ifrn.peoo.aula14;

import java.util.Date;
import java.util.Objects;

public class Aluno {

    private String matricula, nome, senha;
    private Date dataNascimento;
    private double media;

    public Aluno(String matricula, String nome, Date dataNascimento, double media, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.media = media;
        this.senha = senha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Aluno) {

            Aluno outro = (Aluno) obj;

            return this.matricula.equalsIgnoreCase(outro.getMatricula());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

}
