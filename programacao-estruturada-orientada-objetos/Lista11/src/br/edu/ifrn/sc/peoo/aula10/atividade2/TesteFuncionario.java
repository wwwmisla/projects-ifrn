package br.edu.ifrn.sc.peoo.aula10.atividade2;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Estagiario e = new Estagiario();
        
        e.setNome("José");
        e.setCPF("111.222.333-44");
        
        System.out.println("Valor do salário estagiário: " + e.calculoSalario() + " R$\n");
        
        Professor p = new Professor();
        
        p.setNome("Maria");
        p.setCPF("555.666.777-88");
        
        System.out.println("Valor do salário professor: " + p.calculoSalario() + " R$\n");
        
        Diretor d = new Diretor();
        
        d.setNome("João");
        d.setCPF("999.101.111-12");
        
        System.out.println("Valor do salário diretor: " + d.calculoSalario() + " R$");
    }
}
