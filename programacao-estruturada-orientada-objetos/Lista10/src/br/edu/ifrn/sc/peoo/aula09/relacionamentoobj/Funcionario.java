package br.edu.ifrn.sc.peoo.aula09.relacionamentoobj;
/*a) Qual é o tipo de relacionamento apresentado entre as classes presentes no diagrama e a
multiplicidade? O tipo de relacionamento é a composição, a multiplicidade no funcionário tem que ser apenas 1 e no dependente pode ir de 0 à 1.
*/

public class Funcionario {
    private String matricula, nome;
    private double salario;
    private Dependente depentente;
    
    public Funcionario() {
        
    }

    public Funcionario(String matricula, String nome, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setDependente(Dependente dependente) {
        
        this.depentente = dependente;
        
    }
}
