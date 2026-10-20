// 17    Permita o cadastro de nome e preço de produtos até que "fim" seja digitado. Calcule o total geral.


import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        char letra;
        int vogais = 0;

        do {
            System.out.print("Digite uma letra (x para sair): ");
            entrada = sc.next().toLowerCase();

            if (entrada.length() > 1) {
                System.out.println("Digite no máximo 1 caracteres!");
            }
        } while (entrada.length() > 1);

        letra = entrada.charAt(0);

        while (letra != 'x') {
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                vogais++;
            }

            do {
                System.out.print("Digite outra letra (x para sair): ");
                entrada = sc.next().toLowerCase();

                if (entrada.length() > 1) {
                    System.out.println("Digite no máximo 1 caracteres!");
                }
            } while (entrada.length() > 1);

            letra = entrada.charAt(0);
        }

        System.out.println("Quantidade de vogais digitadas: " + vogais);

    }
}
