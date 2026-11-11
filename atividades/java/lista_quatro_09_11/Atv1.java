
public class Atv1 {
    public static void main(String[] args) {
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(procurarChar(letras, 'c'));
        System.out.println(procurarChar(letras, 'z'));
    }
    
    public static boolean procurarChar(char[] array, char valor){
        for(int i = 0; i<array.length; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
