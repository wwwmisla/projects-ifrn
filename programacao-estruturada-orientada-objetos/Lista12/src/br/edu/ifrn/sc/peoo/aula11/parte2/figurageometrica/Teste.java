package br.edu.ifrn.sc.peoo.aula11.parte2.figurageometrica;

public class Teste {

    //CÓDIGO COM POLIMORFISMO NUTELLA
    public static void main(String[] args) {
        FiguraGeometrica fl = new Losango(6);
        Losango l = new Losango(5);
        Retangulo r = new Retangulo(2, 5);

        int v1 = fl.calcularPerimetro();
        int v2 = l.calcularPerimetro();
        int v3 = r.calcularPerimetro();

        System.out.println("----- FIGURAS GEOMETRICAS -----");
        System.out.println("Losango com polimorfismo: " + v1);
        System.out.println("Losango sem polimorfismo: " + v2);
        System.out.println("Retângulo: " + v3);

    }
}

    /*CÓDIGO COM POLIMORFISMO RAÍZ
     public static void main(String[] args) {
        FiguraGeometrica[] figuras = {new Losango(5), new Retangulo(2,5)};
        
        for(FiguraGeometrica figuraGeometrica: figuras){
            
            calcularPerimetro(figuraGeometrica);
            
        }
    }
     
    public static void calcularPerimetro(FiguraGeometrica a){
        
        System.out.println(a.calcularPerimetro());
    }*/
