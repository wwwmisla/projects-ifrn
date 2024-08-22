package br.edu.ifrn.peoo.aula15;

import br.edu.ifrn.peoo.aula15.arquivos.ManipuladorArquivoObjeto;
import java.util.ArrayList;

public class RepositorioAlunos {

    private ArrayList<Alunos> alunos;

    public RepositorioAlunos() {
        alunos = ManipuladorArquivoObjeto.ler("alunos.txt");

        if (alunos == null) {
            alunos = new ArrayList<>();
        }
    }

    public void adicionar(Alunos a) {
        alunos.add(a);
        ManipuladorArquivoObjeto.gravar(alunos, "alunos.txt");
    }

}
