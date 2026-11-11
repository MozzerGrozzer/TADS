public class Atv14 {
    public static void main(String[] args) {

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                if (i == j || i + j == numeros.length - 1)
                    numeros[i][j] = 3;
                 else if (j % 2 != 0) 
                    numeros[i][j] = 1;
                 else
                    numeros[i][j] = 2;
            }
        }

        for (int[] numero : numeros) {
            for (int j = 0; j < numero.length; j++) {
                System.out.print(numero[j] + " ");
            }
            System.out.println();
        }
    }
}
