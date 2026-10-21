// 23    Peça a digitação de um número inteiro até que seja digitado um valor negativo. Ao digitar um valor negativo, deverão ser exibidos a média dos números digitados, o menor número, o maior número, quantidade de números pares e quantidade de números ímpares.

import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, soma = 0, quant = 0, menor = 0, maior = 0, pares = 0, impares = 0;

        System.out.println("Digite um número inteiro (insira um negativo para encerrar): ");
        numero = sc.nextInt();

        while (numero >= 0) { // parte de checagem
            if (quant == 0) {
                menor = numero;
                maior = numero;
            } else {
                if (numero < menor)
                    menor = numero;
                
                if(numero > maior) 
                    maior = numero;                
            }

            soma += numero;
            quant++;
            
            if(numero % 2 == 0)
                pares++;
            else
                impares++;
            
            System.out.println("Digite um número inteiro (insira um negativo para encerrar): ");
            numero=sc.nextInt();
        }

        if(quant > 0){
            double media = (double) soma / quant;

            System.out.println("\nOs resultados!!");
            System.out.printf("Média: %.2f%n", media);
            System.out.println("Menor número: " + menor);
            System.out.println("Maior número: " + maior);
            System.out.println("Quantidade de pares: " + pares);
            System.out.println("Quantidade de impares: " + impares);
        } else
            System.err.println("Nenhum número válido foi digitado.");
    }
}
