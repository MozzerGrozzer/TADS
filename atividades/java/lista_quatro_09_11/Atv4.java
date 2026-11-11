import java.util.Random;

public class Atv4 {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numeros = new int[100]; // eu quase fiz 100 numeros aleatórios, o gepeto me impediu
        int quantidade = 0; // teste

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(100) + 1;
        }

        for (int i = 0; i < numeros.length; i++){
            if(verificarPrimo(numeros[i])){
                System.out.println("Numero: " + numeros[i] + " posição: " + i);

                quantidade++; // teste
            }
        }
        System.out.println("Total de primos encontrados: " + quantidade);
    }

    public static boolean verificarPrimo(int numero){
        if (numero < 2){
            return false;
        }

        for (int i = 2; i < numero; i++){
            if(numero % i ==0){
                return false;
            }
        }
        return true;
    }
}

// O código constantemente estava entregando entre 17 a 23 respostas
// em 100 tentativas com 100 números aleatórios (repetidos incluso) a probabilidade de achar primos é de ~18%
// 18% é 18 em 100, 18 linhas de 100 tentativas
// uau