import java.util.Scanner;

public class ProvaUmFancy { // organizado em metodo, uau 
                                // esse foi feito com IA,
                                // meow
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // lista
        mostrarOpcoesEmbalagem();
        int opcaoEmbalagem = sc.nextInt();

        if (!embalagemValida(opcaoEmbalagem)) {
            System.err.println("Escolha uma opção de embalagem válida.");
            return;
        }
        // quantidade de unidades
        System.out.println("Quantas unidades deseja comprar?");
        int unidades = sc.nextInt();

        if (!quantidadeValida(unidades)) {
            System.err.println("A quantidade deve estar entre 1 e 20 unidades.");
            return;
        }
        // embaladas?
        System.out.println("Você quer que as embalagens venham embaladas?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int empacotamentos = sc.nextInt();

        if (!opcaoSimOuNaoValida(empacotamentos)) {
            System.err.println("Opção de empacotamento inválida.");
            return;
        }
        //frete?
        System.out.println("Deseja contratar o serviço de frete?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int frete = sc.nextInt();

        if (!opcaoSimOuNaoValida(frete)) {
            System.err.println("Opção de frete inválida.");
            return;
        }

        double precoUnitario = obterPrecoEmbalagem(opcaoEmbalagem);
        String nomeEmbalagem = obterNomeEmbalagem(opcaoEmbalagem);

        double total = calcularTotal(
                precoUnitario,
                unidades,
                empacotamentos,
                frete
        );

        System.out.println();
        System.out.println("Resumo da compra:");
        System.out.println("Embalagem escolhida: " + nomeEmbalagem);
        System.out.println("Quantidade: " + unidades);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total: R$ %.2f%n", total);

        sc.close();
    }

    public static void mostrarOpcoesEmbalagem() {
        System.out.println("Escolha a embalagem:");
        System.out.println("1 - Embalagem quadrada (R$ 10,00)");
        System.out.println("2 - Embalagem circular (R$ 13,00)");
        System.out.println("3 - Embalagem triangular (R$ 12,00)");
        System.out.println("4 - Embalagem grande (R$ 20,00)");
        System.out.println("5 - Embalagem pequena (R$ 7,00)");
    }

    public static boolean embalagemValida(int opcao) {
        return opcao >= 1 && opcao <= 5;
    }

    public static boolean quantidadeValida(int unidades) {
        return unidades >= 1 && unidades <= 20;
    }

    public static boolean opcaoSimOuNaoValida(int opcao) {
        return opcao == 1 || opcao == 2;
    }

    public static double obterPrecoEmbalagem(int opcao) {
        switch (opcao) {
            case 1:
                return 10.00;
            case 2:
                return 13.00;
            case 3:
                return 12.00;
            case 4:
                return 20.00;
            case 5:
                return 7.00;
            default:
                return 0.00;
        }
    }

    public static String obterNomeEmbalagem(int opcao) {
        switch (opcao) {
            case 1:
                return "Embalagem quadrada";
            case 2:
                return "Embalagem circular";
            case 3:
                return "Embalagem triangular";
            case 4:
                return "Embalagem grande";
            case 5:
                return "Embalagem pequena";
            default:
                return "Embalagem desconhecida";
        }
    }
    //calculo inteiro
    public static double calcularTotal(
            double precoUnitario,
            int unidades,
            int empacotamentos,
            int frete) {

        double subtotal = precoUnitario * unidades;

        if (empacotamentos == 1) {
            subtotal = subtotal * 1.05;
        }

        if (frete == 1) {
            subtotal = subtotal * 1.10;
        }

        return subtotal;
    }
}