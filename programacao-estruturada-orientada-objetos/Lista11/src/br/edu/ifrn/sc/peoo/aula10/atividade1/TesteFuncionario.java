package br.edu.ifrn.sc.peoo.aula10.atividade1;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Estagiario estagiario = new Estagiario();
        
        estagiario.setNome("José");
        estagiario.setCpf("111.222.333-44");
        
        System.out.println("Valor do salário estagiário: " + estagiario.calculoSalario() + " R$\n");
        
        Professor professor = new Professor();
        
        professor.setNome("Maria");
        professor.setCpf("555.666.777-88");
        
        System.out.println("Valor do salário professor: " + professor.calculoSalario() + " R$\n");
        
        Diretor diretor = new Diretor();
        
        diretor.setNome("João");
        diretor.setCpf("999.101.111-12");
        
        System.out.println("Valor do salário diretor: " + diretor.calculoSalario() + " R$");
        
    }
}
