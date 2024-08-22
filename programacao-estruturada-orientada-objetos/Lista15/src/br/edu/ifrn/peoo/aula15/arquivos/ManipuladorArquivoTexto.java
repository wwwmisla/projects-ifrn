package br.edu.ifrn.peoo.aula15.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class ManipuladorArquivoTexto {

    private static final String DEFAULT_CHARSET = "ISO-8859-1"; //Mais utilizados: "ISO-8859-1" (Windows) e "UTF8" (UNIX);
    private static final String DELIMITADOR = ";"; //Mais utilizados: espaço (" "), Tabulação ("\t"), vírgula (",") e ponto e vírgula (";")

    public static void escrever(String linha, String nomeArquivo) {

        BufferedWriter bw = null;
        final boolean ADICIONAR_AO_FINAL = true;

        try {

            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nomeArquivo, ADICIONAR_AO_FINAL), DEFAULT_CHARSET));
            bw.write(linha);
            bw.newLine();
            bw.flush();
        } catch (UnsupportedEncodingException ex1) {
            System.out.println(ex1.getMessage());
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());
        } finally {
            if (bw != null) {
                try {
                    bw.close(); //tenta fechar o arquivo
                } catch (IOException e) {
                    System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
                }
            }
        }
    }

    public static void ler(final String nomeArquivo) {

        BufferedReader br = null;

        try {

            int contaLinhas = 0;

            br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(nomeArquivo)), DEFAULT_CHARSET));

            String linha = br.readLine(); // tenta ler a primeira linha

            // Testa se existe uma linha a ser lida
            while (linha != null) {

                System.out.println("Dado lido: " + linha);

                linha = br.readLine(); // tenta ler a próxima linha
                contaLinhas++;
            }
            System.out.println("Número total de linhas lidas: " + contaLinhas);
        } catch (UnsupportedEncodingException ex1) {
            System.out.println(ex1.getMessage());
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());
        } finally {

            if (br != null) {
                try {
                    br.close(); //tenta fechar o arquivo
                } catch (IOException e) {
                    System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
                }
            }
        }
    }

    public static void lerTextoComDelimitador(final String nomeArquivo) {

        BufferedReader br = null;

        try {

            String linha;
            int contaLinhas = 0;

            br = new BufferedReader(new InputStreamReader(new FileInputStream(nomeArquivo), DEFAULT_CHARSET));

            while ((linha = br.readLine()) != null) {

                String[] tokens = linha.split(DELIMITADOR);

                // Cada dado (também chamado de token), que estava separado pelo dilimitador, estará em uma posição do vetor 
                for (String dado : tokens) {
                    System.out.println("Dado lido: " + dado);
                }

                contaLinhas++;
            }
            System.out.println("Número total de linhas lidas: " + contaLinhas);
        } catch (UnsupportedEncodingException ex1) {
            System.out.println(ex1.getMessage());
        } catch (FileNotFoundException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close(); //tenta fechar o arquivo
                } catch (IOException e) {
                    System.out.println("Erro ao tentar fechar o arquivo. Motivo: " + e.getMessage());
                }
            }
        }
        
    }
}
