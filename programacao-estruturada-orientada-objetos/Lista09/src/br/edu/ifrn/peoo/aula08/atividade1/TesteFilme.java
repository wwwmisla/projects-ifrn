package br.edu.ifrn.peoo.aula08.atividade1;

import java.util.Scanner;

public class TesteFilme {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Scanner leia1 = new Scanner(System.in);

        //OBJETO 1
        System.out.println("Digite o título do filme em português: ");
        String nomeBr = leia.nextLine();
        
        System.out.println("Digite o título do filme original: ");
        String nomeOrig = leia.nextLine();

        System.out.println("Digite o diretor do filme: ");
        String diretor = leia.nextLine();

        System.out.println("Digite o gênero do filme: ");
        String genero = leia.nextLine();
        
        System.out.println("Digite o elenco do filme: ");
        String elenco = leia.nextLine();
        
        System.out.println("Digite a avaliação do filme: ");
        double avaliacao = leia1.nextDouble();

        System.out.println("Digite a classificação do filme: ");
        int classificacao = leia1.nextInt();

        System.out.println("Digite em segundos a duração do filme: ");
        int duracao = leia1.nextInt();

        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leia1.nextInt();

        Filme f1 = new Filme(nomeBr, nomeOrig, diretor, genero, elenco, avaliacao, classificacao, duracao, anoDeLancamento);

        //OBJETO 2
        Filme f2 = new Filme();

        System.out.println("Digite o título do filme em português:");
        f2.setNomeBr(leia.nextLine());
        
        System.out.println("Digite o título do filme original:");
        f2.setNomeOrig(leia.nextLine());

        System.out.println("Digite o nome do diretor:");
        f2.setDiretor(leia.nextLine());

        System.out.println("Digite o gênero do filme:");
        f2.setGenero(leia.nextLine());
        
        System.out.println("Digite o elenco do filme:");
        f2.setElenco(leia.nextLine());
        
        System.out.println("Digite a avaliação do filme: ");
        f2.setAvaliacao(leia1.nextDouble());

        System.out.println("Digite a classificação do filme: ");
        f2.setClassificacao(leia1.nextInt());

        System.out.println("Digite em segundos a duração do filme: ");
        f2.setDuracao(leia1.nextInt());

        System.out.println("Digite o ano de lançamento do filme: ");
        f2.setAnoDeLancamento(leia1.nextInt());
        
        //OBJETO 3
        Filme f3 = new Filme();

        f3.setNomeBr("Meu pai");
        f3.setGenero("Drama");
        f3.setNomeOrig("The father");
        f3.setAnoDeLancamento(2020);
        f3.setClassificacao(12);
        f3.setDuracao(3900);

        //SYSTENS PARA IMPRIMIR A SAÍDA
        System.out.println("Título: " + f1.getNomeBr() + "/" + f1.getNomeOrig() + ", Diretor: " + f1.getDiretor() 
        + ", Gênero: " + f1.getGenero() + ", Elenco: " + f1.getElenco() + ", Avaliação: " + f1.getAvaliacao() + 
        ", Classificação: " + f1.getClassificacao() + ", Duração: " + f1.getDuracao() + ", Ano de lançamento: " + f1.getAnoDeLancamento());
        
        System.out.println("Título: " + f2.getNomeBr() + "/" + f2.getNomeOrig() + ", Diretor: " + f2.getDiretor() 
        + ", Gênero: " + f2.getGenero() + ", Elenco: " + f2.getElenco() + ", Avaliação: " + f2.getAvaliacao() + 
        ", Classificação: " + f2.getClassificacao() + ", Duração: " + f2.getDuracao() + ", Ano de lançamento: " + f2.getAnoDeLancamento());
        
        System.out.println(f3.toString());
        
    }

}
