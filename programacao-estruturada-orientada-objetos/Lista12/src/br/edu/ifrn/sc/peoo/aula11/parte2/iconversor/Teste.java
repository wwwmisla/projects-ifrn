package br.edu.ifrn.sc.peoo.aula11.parte2.iconversor;

public class Teste {
    
    // CÓDIGO COM POLIMORFISMO NUTELLA:
    public static void main(String[] args) {
        ConversorMoeda cMoeda = new ConversorMoeda();
        ConversorMedida cMedida = new ConversorMedida();
        
        double ob1 = cMoeda.converter(120.00);
        double ob2 = cMedida.converter(120.00);
        
        /*IConversor i = new IConversor();
        c) É possível instanciar objetos de IConversor? Justifique sua resposta;
        Não é possível instanciar objetos de IConversor, pois as interfaces são tipos abstratas logo não podem instaciar nada.
        
        d) É possível utilizar Polimorfismo? Caso afirmativo, escreva um exemplo de como fazer utilizando
        a classe de Teste. Sim é possível utilizar polimorfismo
        IConversor ICM1 = new ConversorMoeda();
        IConversor ICM2 = new ConversorMedida();*/
        
        System.out.println("Conversor de Moeda: \n" + "120,00 R$ / 4,60 EUR = " + ob1);
        System.out.println("Conversor de Medida: \n" + "120,00 cm * 0,393701 in = " + ob2);
    }
}   
    //CÓDIGO COM POLIMORFISMO RAÍZ:
    /*public static void conversor(IConversor a){
        
        System.out.println(a.converter(120.00));
        
    }
    
    public static void main(String[] args) {
        IConversor[] conversores = {new ConversorMoeda(), new ConversorMedida()};
        
        for (IConversor conversore : conversores) {
            conversor(conversore);
        }
    }
}*/

