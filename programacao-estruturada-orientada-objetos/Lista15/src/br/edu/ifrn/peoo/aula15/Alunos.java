package br.edu.ifrn.peoo.aula15;

import java.util.Date;
import java.util.Objects;
import java.io.Serializable;

public class Alunos implements Serializable {

    private String matricula, nome, senha;
    private Date dataNascimento;
    private double media;

    public Alunos(String matricula, String nome, String senha, Date dataNascimento, double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
        this.media = media;
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

        if (obj != null && obj instanceof Alunos) {

            Alunos outro = (Alunos) obj;

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

    @Override
    public String toString() {
        return matricula + " - " + nome + " - " + dataNascimento + " - " + media; 
    }
}
