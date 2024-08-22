package doador;

import java.util.Scanner;

public class TesteDoador {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Doador d1 = new Doador();

        System.out.println("Digite o nome do doador: ");
        String nome = leia.nextLine();
        d1.setNome(nome);

        System.out.println("Digite a idade do doador: ");
        int idade = leia.nextInt();
        d1.setIdade(idade);

        System.out.println("Digite o tipo sanguineo do doador: ");

        String tipoSanguineo = leia.next();
        d1.setTipoSanguineo(tipoSanguineo);

        System.out.println("Digite o peso do doador: ");
        double peso = leia.nextDouble();
        d1.setPeso(peso);

        System.out.println(" -- Dados do doador 1 -- ");
        System.out.println("Nome do doador: " + d1.getNome() + ", Idade: " + d1.getIdade()
                + ", Tipo sanguíneo: " + d1.getTipoSanguineo() + ", Peso: " + d1.getPeso());

        Doador d2 = new Doador();

        d2.setNome("josé");
        d2.setIdade(20);
        d2.setPeso(60);
        d2.setTipoSanguineo("B");

        System.out.println(" -- Dados do doador 2 -- ");
        System.out.println(d2.toString());


    }

}
