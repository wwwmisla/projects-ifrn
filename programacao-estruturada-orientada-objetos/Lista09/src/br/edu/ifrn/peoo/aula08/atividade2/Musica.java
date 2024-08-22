package br.edu.ifrn.peoo.aula08.atividade2;

public class Musica {

    //atributos
    private String titulo, artista, album;
    private int anoDeLancamento, ranking, duracao;

    //construtor padrão
    public Musica() {

    }

    //construtor parametrizado
    public Musica(String titulo, String artista, String album, int anoDeLancamento, int ranking, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anoDeLancamento = anoDeLancamento;
        this.ranking = ranking;
        this.duracao = duracao;
    }

    //métodos acessores (get e set)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
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
        
        
        String ret = minutosS + ":" + segundosS;
        
        return ret;

    }

    public void setDuracao(int duracao) {
        
        this.duracao = duracao;

    }

    //Métodos abstratos
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Título: ");
        sb.append(titulo);
        sb.append(", Artista: ");
        sb.append(artista);

        return sb.toString();
    }

}
