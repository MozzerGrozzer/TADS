/*
    
Uma transportadora precisa disponibilizar um aplicativo aos seus clientes para cálculo rápido de frete de encomendas que possuam apenas um determinado tipo de produto. Inicialmente, será desenvolvido um algoritmo para verificar a aplicabilidade da solução proposta.  
O objetivo é que, ao receber as informações sobre o frete, o algoritmo consiga estimar o valor, respeitando os requisitos especificados. 
Para cálculo do frete, é necessário informar: 

    Código do produto 

        001 – Mouse Óptico USB – R$ 35,00 

        002 – SSD 240GB – R$ 200,00 

        003 – Adaptador wireless USB – R$ 75,00 

        004 – Pen Drive 16GB – R$ 20,00 

        005 – Webcam – R$ 159,00 

    Quantidade 

    Região de destino 

        Sul (7%) 

        Sudeste (5%) 

        Centro-Oeste (9%) 

        Nordeste (12%) 

        Norte (15%) 

    Tipo de embalagem 

        Caixa de papelão grande comum (10,00) 

        Caixa de papelão grande triplex (20,00) 

        Plástico bolha (12,00) 

        Saco plástico (5,00) 

    Adicionais, que são opcionais 

        Seguro (5%) 

        Rastreamento (3%) 

        Escolta armada (10%) 

Após receber as informações, o algoritmo deverá exibir as seguintes informações:  

    valor total do produto (qtd x preço unitário) 

    valor subtotal do frete (de acordo com a região) 

    valor da embalagem 

    valor cobrado pelos adicionais 

    valor final da operação (soma de todos os valores). 

Informações: 

    A quantidade não poderá ser superior a 10 

    A embalagem é apenas uma, independentemente da quantidade de produtos 

    Os adicionais são opcionais 

    Pode ser escolhido mais de um adicional 

 
Critérios de avaliação 

    Identificação e declaração das variáveis (10%) 

    Validação de dados (25%) 

    Cálculo do valor (45%) 

    Exibição das informações (20%) 


*/

import java.util.Scanner;

public class ProvaDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, unidades, regiao, embalagem, opcionais;
        double total, subtotal, precoUnitario, preco, totalEmbalagens;
        
        System.out.println("Qual o produto?");
        System.out.println("001 – Mouse Óptico USB – R$ 35,00");
        System.out.println("002 – SSD 240GB – R$ 200,00");
        System.out.println("003 – Adaptador wireless USB – R$ 75,00");
        System.out.println("004 – Pen Drive 16GB – R$ 20,00");
        System.out.println("005 – Webcam – R$ 159,00");
        codigo = sc.nextInt();
        switch(codigo){
            case 1:
                preco = 35;
                break;
            case 2:
                preco = 200;
                break;
            case 3:
                preco = 75;
                break;
            case 4:
                preco = 20;
                break;
            case 5:
                preco = 159;
                break;
            default:
                System.err.println("Escolha uma opção valida");
                return;
        }

        System.out.println("Quantas unidades?");
        unidades = sc.nextInt();
        
        if (unidades <= 0 || unidades > 10) {
            System.err.println("A quantidade deve estar entre 1 e 10 unidades.");
            return;
        }

        precoUnitario = preco * unidades;

        System.out.println("Qual o destino?");
        System.out.println("1 - Sul (7%)");
        System.out.println("2 - Sudeste (5%)");
        System.out.println("3 - Centro-Oeste (9%)");
        System.out.println("4 - Nordeste (12%)");
        System.out.println("5 - Norte (15%)");
        regiao = sc.nextInt();
        switch(codigo){
            case 1:
                subtotal = precoUnitario * 1.07;
                break;
            case 2:
                subtotal = precoUnitario * 1.05;
                break;
            case 3:
                subtotal = precoUnitario * 1.09;
                break;
            case 4:
                subtotal = precoUnitario * 1.12;
                break;
            case 5:
                subtotal = precoUnitario * 1.15;
                break;
            default:
                System.err.println("Escolha uma opção valida");
                return;
        }
        
        
        System.out.println("Qual será a embalagem?");
        System.out.println("1 - Caixa de papelão grande comum (10,00)");
        System.out.println("2 - Caixa de papelão grande triplex (20,00)");
        System.out.println("3 - Plástico bolha (12,00)");
        System.out.println("4 - Saco plástico (5,00)");
        embalagem = sc.nextInt();
        switch(embalagem){
            case 1:
                embalagem = 10;
                precoUnitario = precoUnitario + 10;
                break;
            case 2:
                embalagem = 20;
                precoUnitario = precoUnitario + 20;
                break;
            case 3:
                embalagem = 12;
                precoUnitario = precoUnitario + 12;
                break;
            case 4:
                embalagem = 12;
                precoUnitario = precoUnitario + 5;
                break;
            default:
                System.err.println("Escolha uma opção valida");
                return;
        }

        System.out.println("(Adicional) Você quer que seja entregue com:");
        System.out.println("1 - Seguro (5%)");
        System.out.println("2 - Rastreamento (3%)");
        System.out.println("3 - Escolta armada (10%)");
        System.out.println("4 - Ignorar");
        opcionais = sc.nextInt();
        sc.close();
        switch(opcionais){
            case 1:
                precoUnitario = precoUnitario * 1.05;
                break;
            case 2:
                precoUnitario = precoUnitario * 1.03;
                break;
            case 3:
                precoUnitario = precoUnitario * 1.10;
                break;
            case 4:
                System.out.println("Sem adicionais");
                break;
            default:
                System.err.println("Escolha uma opção valida");
                return;
        }

        total = precoUnitario + subtotal; 

        System.out.printf("Preco unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.println("Preço da embalagem é: R$" + embalagem + "00");
        System.out.printf("Preço total: R$ %.2f%n", total);
    }
}
