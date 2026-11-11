
import java.util.Random;

public class Atv6 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[10][10];

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                if(i == j)
                    matriz[i][j] = -1; // em que krls de mundo eu poderia ter desvendado isso?
                else 
                    matriz[i][j] = random.nextInt(100) + 1;                
            }
        }
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.printf("%4d", matriz1[j]);         
            }
        }
        System.out.println();
    }
}
