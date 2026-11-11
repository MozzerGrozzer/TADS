public class Atv12 {
    public static void main(String[] args) {

        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(procurarChar(letras, 'i', 1, 3));
        System.out.println(procurarChar(letras, 'a', 1, 3));
        System.out.println(procurarChar(letras, 'z', 0, 4));
    }

    public static boolean procurarChar(char[] array, char valor, int inicio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
