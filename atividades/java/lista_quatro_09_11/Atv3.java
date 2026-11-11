public class Atv3 {
    public static int[] buscarValor(int[][] matriz, int valor){
        for (int i= 0; i < matriz.length; i++){
            for (int j = 0; j< matriz[i].length; j++){
                if(matriz[i][j] == valor){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[][] numeros = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int[] coordenada = buscarValor(numeros, 50); // mudar aqui pra achar outras coordenadas

        if (coordenada[0] != -1){
            System.out.println("Linha: " + coordenada[0]);
            System.out.println("Coluna: " + coordenada[1]);
        }
        else
            System.err.println("Valor não encontrado!");
    }
}
