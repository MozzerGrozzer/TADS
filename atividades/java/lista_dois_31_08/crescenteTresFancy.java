import java.util.Scanner;

public class crescenteTresFancy {
    public static void main(String[] args) {
        int n1, n2, n3, aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira três números diferentes");

        n1 = sc.nextInt(); // esse código em especifico foi feito com IA, zero fudendos totais que eu iria pensar nisso, mas é bom manter para
        n2 = sc.nextInt(); // futuras vezes que eu tiver que organizar numerozinho via java
        n3 = sc.nextInt(); // Mozzer.dev

        if (n1 > n2) {
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if (n1 > n3) {
            aux = n1;
            n1 = n3;
            n3 = aux;
        }

        if (n2 > n3) {
            aux = n2;
            n2 = n3;
            n3 = aux;
        }

        System.out.println(n1 + " " + n2 + " " + n3);
    }
}