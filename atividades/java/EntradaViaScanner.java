import java.util.Scanner;

public class EntradaViaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nome");
        String nome = sc.nextLine();
        System.out.println("Ola " + nome + "!");
    }
}
