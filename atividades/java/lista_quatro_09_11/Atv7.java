import java.util.Random;

public class Atv7 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][][] numeros = new int[3][3][3];
        int quantidade = 0;

        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                for(int k = 0; k<numeros[i][j].length; k++){
                    numeros[i][j][k] = (random.nextInt(500) + 1) * 2;
                }               
            }
        }
        for(int i = 0; i<numeros.length; i++){
            for(int j = 0; j<numeros[i].length; j++){
                for(int k = 0; k<numeros[i][j].length; k++){
                    if(numeros[i][j][k] % 5 == 0){
                        System.out.println("Numero: " + numeros[i][j][k]); // teste
                        quantidade++;
                    }
                }               
            }
        }
        System.out.println("Quantidade de numeros divisiveis por 5: " + quantidade);
    }
}
// todos os números divisíveis por 5 terminam em 0 pois apenas decimais são pares divisíveis por 5
// weow