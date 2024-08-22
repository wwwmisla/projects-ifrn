package br.edu.ifrn.peoo.aula08.atividade1;

public class Filme {

    //atributos
    private String nomeBr, nomeOrig, diretor;
    private String genero, elenco;
    private double avaliacao;
    private int classificacao, duracao, anoDeLancamento;

    //construtor padrão
    public Filme() {

    }

    //construtor parametrizado
    public Filme(String nomeBr, String nomeOrig, String diretor, String genero, String elenco, double avaliacao, int classificacao, int duracao, int anoDeLancamento) {
        this.nomeBr = nomeBr;
        this.nomeOrig = nomeOrig;
        this.diretor = diretor;
        this.genero = genero;
        this.elenco = elenco;
        this.avaliacao = avaliacao;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.anoDeLancamento = anoDeLancamento;

    }

    //métodos acessores(get e set)
    public String getNomeBr() {
        return nomeBr;
    }

    public void setNomeBr(String nomeBr) {
        this.nomeBr = nomeBr;
    }

    public String getNomeOrig() {
        return nomeOrig;
    }

    public void setNomeOrig(String nomeOrig) {
        this.nomeOrig = nomeOrig;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getDuracao() {
        int hora = duracao / 3600;
        int horaR = duracao % 3600;
        int minuto = horaR / 60;
        int minutoR = horaR % 60;
        int segundos = minutoR;

        String horasS = Integer.toString(hora);
        String minutosS = Integer.toString(minuto);
        String segundosS = Integer.toString(segundos);

        String ret = horasS + "h " + minutosS + "min " + segundosS + "seg ";

        return ret;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    //método abstrato
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ");
        sb.append(nomeBr);
        sb.append("/");
        sb.append(nomeOrig);
        sb.append(", Gênero: ");
        sb.append(genero);
        sb.append(", Ano de lançamento: ");
        sb.append(anoDeLancamento);
        sb.append(", Classificação: ");
        sb.append(classificacao);
        sb.append(", Duração: ");
        sb.append(getDuracao());

        return sb.toString();
    }

}
