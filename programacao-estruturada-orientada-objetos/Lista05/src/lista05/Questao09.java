package lista05;

public class Questao09 {
    public static void main(String[] args) {
        
        int[][] matriz= {{1,0,2,3},{4,0,5,6},{0,0,0,0},{0,0,0,0}};
        
        int qLinhasNulas = 0;
        int qColunasNulas = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            
            int contColunas= 0;
            
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] ==0 ) {
                    
                    contColunas++;
                    
                }
            }
            if(contColunas == matriz.length){
                qLinhasNulas++;
            }
        }
        
        for (int i = 0; i < matriz[0].length; i++) {
            
            int contLinhas = 0;
            
            for (int j = 0; j < matriz.length; j++) {
                
                if (matriz[j][i] ==0 ) {
                    
                    contLinhas++;
                    
                }
            }
            if(contLinhas == matriz.length){
                qColunasNulas++;
            }
        }
        System.out.println("A quantidade de linhas nulas é: " + qLinhasNulas);
        System.out.println("A quantidade de colunas nulas é: " + qColunasNulas);
    }
}
