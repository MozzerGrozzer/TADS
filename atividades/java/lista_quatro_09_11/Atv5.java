
import java.util.Random;

public class Atv5 {
    public static void main(String[] args) {
        Random random = new Random();

        double[][] numeros = new double[5][5];

        for (double[] numero : numeros) { // quick fix do vscode, eu nunca vi isso, vo aturar do mesmo jeito >;)
            for (int j = 0; j < numeros.length; j++) {
                numero[j] = random.nextDouble() * 100;
            }            
        }

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if (numeros[i][j] > 50)
                    // System.out.println("Valor: " + numeros[i][j] + " Linha: " + i +" Coluna: " + j);
                    System.out.printf("Valor: %.2f Linha: %d Coluna: %d%n", numeros[i][j], i, j);
                }            
            }
        System.out.println("pleasing");
    }
}
