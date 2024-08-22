package br.edu.ifrn.sc.peoo.aula09.relacionamentoobj;

/*a) Qual é o tipo de relacionamento apresentado entre as classes presentes no diagrama e a
multiplicidade? O tipo de relacionamento é agregação e a multiplicidade(0...*) vai de 0 à muitos.
 */
import java.util.ArrayList;

public class Projeto {

    private int codigo;
    private String nome;
    private ArrayList<Desenvolvedor> desenvolvedor;

    public Projeto() {
        desenvolvedor = new ArrayList<Desenvolvedor>();
    }

    public Projeto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.desenvolvedor = new ArrayList<Desenvolvedor>();

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void adicionar(Desenvolvedor a) {
        this.desenvolvedor.add(a);
    }

    public ArrayList<Desenvolvedor> getDesenvolvedor() {
        return desenvolvedor;
    }

}
