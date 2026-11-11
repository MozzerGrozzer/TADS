public class Atv13 {
    public static void main(String[] args) {

        char[][] letras = new char[5][5];

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if (i % 2 == 0)
                    letras[i][j] = 'a';
                 else 
                    letras[i][j] = 'b';
            }
        }

        for (char[] letra : letras) {
            for (int j = 0; j < letra.length; j++) {
                System.out.print(letra[j] + " ");
            }
            System.out.println();
        }
    }
}

