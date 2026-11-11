import java.util.Random;

public class Atv10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] numeros = new int[10][10];
        double[] resultados = new double[3];

        for (int[] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                numero[j] = random.nextInt(1000) + 1;
            }
        }

        int maior = numeros[0][0];
        int menor = numeros[0][0];
        int soma = 0;

        for (int[] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                if (numero[j] > maior) {
                    maior = numero[j];
                }
                if (numero[j] < menor) {
                    menor = numero[j];
                }
                soma += numero[j];
            }
        }
                
        resultados[0] = maior;
        resultados[1] = menor;
        resultados[2] = (double) soma / 100; // Armazenar os resultados

        System.out.println("Maior valor: " + resultados[0]); // recorde: 994.92
        System.out.println("Menor valor: " + resultados[1]); // recorde: 4.0
        System.out.printf("Media: %.2f%n", resultados[2]);
    }
}
