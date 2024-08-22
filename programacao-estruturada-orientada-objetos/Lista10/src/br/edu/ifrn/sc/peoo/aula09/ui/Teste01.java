package br.edu.ifrn.sc.peoo.aula09.ui;

import br.edu.ifrn.sc.peoo.aula09.relacionamentoobj.Desenvolvedor;
import br.edu.ifrn.sc.peoo.aula09.relacionamentoobj.Projeto;

public class Teste01 {

    public static void main(String[] args) {
        Projeto p1 = new Projeto();

        Desenvolvedor d1 = new Desenvolvedor("Misla Wislaine", 1500.80);

        p1.setCodigo(1517);
        p1.setNome("Tüz");
        
        p1.adicionar(d1);
        
        System.out.println("----- PROJETO -----");
        System.out.print("Código: " + p1.getCodigo());
        System.out.print(", Nome: " + p1.getNome());
        System.out.println("\n" + d1.toString());
        
    }
}
