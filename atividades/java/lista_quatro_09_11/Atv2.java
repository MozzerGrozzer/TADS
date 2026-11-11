import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        char[] letras = new char[5];
        Scanner sc = new Scanner(System.in);
        
        for( int i = 0; i< letras.length; i++){
            System.out.println("Digite uma letra: ");
            char letra = sc.next().charAt(0);

            if (procurarChar(letras, letra)){
                System.out.println("Essa letra já foi utilizada!");
                i--;
            } else {
                letras[i] = letra;
            }
        }

        System.out.println("Array preenchido: ");

        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i] + " ");
        }

        sc.close();
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
