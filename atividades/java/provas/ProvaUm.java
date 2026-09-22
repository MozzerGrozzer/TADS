import java.util.Scanner;
/*
    Uma empresa quer um script que auxilia a compra de 5 embalagens diferentes
    O numero de embalagens não pode exceder 20 unidades
    Há bonus por empacotamentos diferentes (5%) e frete (10%)
*/

public class ProvaUm {
    public static void main(String[] args) {
        int embalagem, unidades, empacotamentos, frete;
        double preco, total;
        String embalagemNome;
        Scanner sc = new Scanner(System.in);
        // embalagem
        System.out.println("Escolha que embalagem deseja comprar digitando o número a frente da opção que deseja");
        System.out.println("1-embalagem quadrada (10)");
        System.out.println("2-embalagem Circular (13)");
        System.out.println("3-embalagem Triangulo (12)");
        System.out.println("4-embalagem grande (20)");
        System.out.println("5-embalagem pequena (7)");
        embalagem = sc.nextInt();
        switch(embalagem){
            case 1:
                preco = 10;
                embalagemNome = "Embalagem quadrada";
                break;
            case 2:
                preco = 13;
                embalagemNome = "Embalagem circular";
                break;
            case 3:
                preco = 12;
                embalagemNome = "Embalagem triangular";
                break;
            case 4:
                preco = 20;
                embalagemNome = "Embalagem grande";
                break;
            case 5:
                preco = 7;
                embalagemNome = "Embalagem pequena";
                break;
            default:
                System.err.println("Escolha uma opção válida");
                return;
        }
        //unidades
        System.out.println("Quantas unidades?");
        unidades = sc.nextInt();
        
        if (unidades <= 0 || unidades > 20) {
            System.err.println("A quantidade deve estar entre 1 e 20 unidades.");
            return;
        }
        // embalar?
        System.out.println("Você quer que as embalagens venham embaladas?");
        System.out.println("1-Sim");
        System.out.println("2-Não");
        empacotamentos = sc.nextInt();
        
        // frete?
        System.out.println("Deseja serviços de frete?");
        System.out.println("1-Sim");
        System.out.println("2-Não");
        frete = sc.nextInt();
        sc.close();

        if (empacotamentos != 1 && empacotamentos != 2) {
            System.err.println("Opção de empacotamento inválida.");
            return;
        }
        
        if (frete != 1 && frete != 2) {
            System.err.println("Opção de frete inválida.");
            return;
        }

        total = preco * unidades;
        
        if (empacotamentos == 1){
            total = total * 1.05;
        }

        if (frete == 1){
            total = total * 1.10;
        }
    
        System.out.printf("Preço total: R$ %.2f%n", total);
        System.out.println("Você escolheu: " + embalagemNome);
        System.out.println("Quantidade " + unidades);
    }
}
