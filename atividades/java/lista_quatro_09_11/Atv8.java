import java.util.Random;

public class Atv8 {
    public static void main(String[] args) {
 Random random = new Random();

        int[] primeiro = new int[10];
        int[] segundo = new int[20];

        for (int i = 0; i < primeiro.length; i++) {
            primeiro[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < primeiro.length; i++) { // cada número do primeiro array ocupa duas posições no segundo array
            segundo[i * 2] = primeiro[i]; // Multiplicar o índice por 2 encontra a primeira posição disponível do par
            segundo[i * 2 + 1] = primeiro[i] * 2; // Somar 1 encontra a posição seguinte
        }                                                                   // muito sabidfo

        System.out.println("Primeiro array:"); // exibir o primeiro array

        for (int i = 0; i < primeiro.length; i++) {
            System.out.print(primeiro[i] + " ");
        }

        System.out.println("\nSegundo array:"); // vc não vai acreditar

        for (int i = 0; i < segundo.length; i++) {
            System.out.print(segundo[i] + " ");
        }
    }
}
