package br.edu.ifrn.sc.peoo.aula09.ui;

import br.edu.ifrn.sc.peoo.aula09.heranca.Pessoa;
import br.edu.ifrn.sc.peoo.aula09.heranca.PessoaFisica;
import br.edu.ifrn.sc.peoo.aula09.heranca.PessoaJuridica;
import java.util.Scanner;

public class Teste03 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Pessoa p = new Pessoa();
        PessoaFisica pf = new PessoaFisica();

        System.out.println("Digite o seu CPF:");
        pf.setCPF(leia.nextLine());

        System.out.println("Digite o seu RG:");
        pf.setRG(leia.nextLine());

        System.out.println("Digite a sua data de nascimento:");
        pf.setDataNascimento(leia.nextLine());
        
        System.out.println("Digite o nome:");
        pf.setNome(leia.nextLine());
        
        System.out.println("Digite o endereço:");
        pf.setEndereco(leia.nextLine());
                
        System.out.println("Digite o telefone:");
        pf.setTelefone(leia.nextLine());

        //////////////
        System.out.println("\nPESSOA JURIDICA");
        System.out.println("Digite a sua CNPJ:");
        String CNPJ = leia.nextLine();

        System.out.println("Digite a inscrição estadual:");
        String inscrEstadual = leia.nextLine();

        System.out.println("Digite a inscrição municipal:");
        String inscrMunicipal = leia.nextLine();
        
        System.out.println("Digite o nome:");
        String nome = leia.nextLine();
        
        System.out.println("Digite o endereço:");
        String endereco = leia.nextLine();
                
        System.out.println("Digite o telefone:");
        String telefone = leia.nextLine();

        PessoaJuridica pj = new PessoaJuridica(CNPJ, inscrEstadual, inscrMunicipal, nome, endereco, telefone);
        
        //p.setCPF();
        //p.setCNPJ();
        
        /*Passo 6: Explicar o que ocorre após escrever p.setCPF() e p.setCNPJ();
    Após escrever o comando p.setCPF(); e p.setCNPJ(); teve-se um erro, pois a classe Pessoa a qual a instância 'p' faz parte, 
    não recebe o atributo CPF e nem o CNPJ, haja vista que as classes as quais estes fazem parte(classe PessoaFísica e PessoaJuridica)são filhas de Pessoa, 
    de tal forma que Pessoa está repassando suas heranças(seus atributos e métodos) para suas classes filhas, contudo suas filhas não estão realizando a mesma tarefa que é estender seus atributos e métodos para a classe mãe.*/
        
        System.out.println("\n----- PESSOA FISÍCA -----");
        System.out.println("CPF: " + pf.getCPF() + ", RG: " + pf.getRG() + ", Data de nascimento: " + pf.getDataNascimento()
        + "\nNome: " + pf.getNome() + ", Endereço: " + pf.getEndereco() + ", Telefone: " + pf.getTelefone());
        System.out.println("----- PESSOA JURIDICA -----");
        System.out.println("CNPJ: " + pj.getCNPJ() + ", Inscrição Estadual: " + pj.getInscrEstadual() + ", Inscrição Municipal: " + pj.getInscrMunicipal() 
        + "\nNome: " + pj.getNome() + ", Endereço: " + pj.getEndereco() + ", Telefone: " + pj.getTelefone());
        
    
    //Passo 7: O que foi impresso ao executar o construtor padrão de PessoaFisica e o parametrizado de PessoaJuridica? 
/*O fato da classe PessoaFisica e da classe PessoaJuridica herdarem os métodos e atributos da classe mãe Pessoa, fez com que a saída fosse impressa na seguinte ordem: 
PESSOA, PESSOA, PESSOA FÍSICA (a primeira PESSOA corresponde a classe mãe, já PESSOA e PESSOA FÍSICA é impresso, porque a classe PessoaFísica recebe atributos e 
métodos da super classe), posteriormente foi impresso atributos da classe PessoaFísica (CPF, RG e dataNascimento) junto com os atributos da classe mãe Pessoa(nome, endereco e telefone), 
isso para que o usuário digitasse essas informações, depois foi impresso PESSOA JURIDICA (diferente dos outros que vieram da classe mãe e filha, esse veio da classe Teste por causa da 
organização do código), em seguida aparece para o usuário digitar os atributos da classe PessoaJuridica(CNPJ, inscrEstadual e inscrMunicipal) mais os atributos da classe mãe Pessoa(nome, endereco e telefone), 
com a sequência de PESSOA e PESSOA JURÍDICA. Para finalizar, foi impresso os comandos que a classe Teste ordenou : Pessoa Física, com os atributos que foram lidos do teclado da classe filha e da classe mãe, 
mais a Pessoa Jurídica, com os atributos da classe filha e os da classe mãe.*/
    }
}
