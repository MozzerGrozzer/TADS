import java.util.Random;

public class Atv11 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] numeros = new int[7][7];

        int soma = 0;
        int multiplicacao = 1;

        for (int[] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                numero[j] = random.nextInt(3) + 1;
            }
        }
        
        for (int i = 0; i < numeros.length; i++) { // quick fix aqui explodiu a porra do código
            for (int j = 0; j < numeros[i].length; j++) { // não fazer quick fix, risco de um código bem vermelho
                
                if(j % 2 != 0)
                    soma += numeros[i][j];
                
                if(i % 2 != 0)
                    multiplicacao *= numeros[i][j];                
            }
        }

        System.out.println("Soma das colunas impares: " + soma);
        System.out.println("Multiplicacao das linhas pares: " + multiplicacao);
    }
}
