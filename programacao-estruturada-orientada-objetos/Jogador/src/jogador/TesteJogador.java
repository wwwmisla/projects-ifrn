package jogador;

import java.util.Scanner;

public class TesteJogador {
    public static void main(String[] args) {
        //Programa principal
        Scanner leia = new Scanner(System.in);
        
        Jogador j1 = new Jogador();
        
        System.out.println("Digite o nome do jogador: ");
        String nome = leia.nextLine();
      
        j1.setNome(nome);
        
        System.out.println("Digite a matrícula do jogador: ");
        int mat = leia.nextInt();
      
        j1.setMatricula(mat);
        
        System.out.println("Digite a posição do jogador: ");
        String posi = leia.next();
      
        j1.setPosicao(posi);
        
        System.out.println("Digite a altura do jogador: ");
        float alt = leia.nextFloat();
      
        j1.setAltura(alt);
        
        System.out.println("Digite o peso do jogador: ");
        float peso = leia.nextFloat();
      
        j1.setPeso(peso);
        
        System.out.println("----- JOGADOR 1 -----"); 
        System.out.println("Nome: " + j1.getNome() + ", Matrícula: " + j1.getMatricula()
        + ", Posição: " + j1.getPosicao() + ", Altura: " + j1.getAltura() + ", Peso: " + j1.getPeso());
        
        Jogador j2 = new Jogador();
        
        j2.setNome("Justin");
        j2.setMatricula(146615);
        j2.setPosicao("Atacante");
        j2.setAltura(1.75f);
        j2.setPeso(70f);
        
        System.out.println("----- JOGADOR 2 -----");
        System.out.println(j2.toString());
        
    }
}
