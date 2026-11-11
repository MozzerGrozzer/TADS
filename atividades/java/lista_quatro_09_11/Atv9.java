import java.util.Random;

public class Atv9{
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(100) + 1;
        }
        
        for (int i = 0; i < numeros.length; i++) { // o que verifica o número
            for (int j = 0; j < i; j++) { // O que percorre a array

                if (numeros[i] == numeros[j]) {
                    numeros[i] = 0;
                    break;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
            if (numeros[i] == 0)
                System.out.printf("repetido! ");
        }
    }
}