package br.edu.ifrn.peoo.aula08.atividade2;

import java.util.Scanner;

public class TesteMusica {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Scanner leia1 = new Scanner(System.in);
        
        //OBJETO 1
        System.out.println("Digite o título da música:");
        String titulo = leia.nextLine();

        System.out.println("Digite o nome do artista da música:");
        String artista = leia.nextLine();

        System.out.println("Digite o nome do álbum da música:");
        String album = leia.nextLine();

        System.out.println("Digite a duração da música em segundos:");
        int duracao = leia1.nextInt();

        System.out.println("Digite o ano de lançamento:");
        int anoDeLancamento = leia1.nextInt();

        System.out.println("Digite o ranking:");
        int ranking = leia1.nextInt();

        Musica m1 = new Musica(titulo, artista, album, anoDeLancamento, ranking, duracao);

        //OBJETO 2
        Musica m2 = new Musica();

        System.out.println("Digite o título da música:");
        m2.setTitulo(leia.nextLine());

        System.out.println("Digite o nome do artista da música:");
        m2.setArtista(leia.nextLine());

        System.out.println("Digite o nome do álbum da música:");
        m2.setAlbum(leia.nextLine());

        System.out.println("Digite a duração da música em segundos:");
        m2.setDuracao(leia1.nextInt());

        System.out.println("Digite o ano de lançamento:");
        m2.setAnoDeLancamento(leia1.nextInt());

        System.out.println("Digite o ranking:");
        m2.setRanking(leia1.nextInt());

        //OBJETO 3
        Musica m3 = new Musica("What Do You Mean", "Justin Bieber", "Porpuse", 2015, 1, 352);

        //SYSTENS PARA IMPRIMIR A SAÍDA
        System.out.println("Título: " + m1.getTitulo() + " , Artista: " + m1.getArtista() + " , Álbum: " + m1.getAlbum() + " , Ano de lançamento: " + m1.getAnoDeLancamento() + " , Ranking: " + m1.getRanking() + " , Duração: " + m1.getDuracao());
        System.out.println("Título: " + m2.getTitulo() + " , Artista: " + m2.getArtista() + " , Álbum: " + m2.getAlbum() + " , Ano de lançamento: " + m2.getAnoDeLancamento() + " , Ranking: " + m2.getRanking() + " , Duração: " + m2.getDuracao());
        System.out.println(m3.toString());
        
    }
}
