import java.util.Scanner;
import java.util.Random;

public class ListaTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        do { 
            System.out.println("Lista 3");
            System.out.println("Digite o número do exercício (1 a 23) ou 0 para sair:");
            System.out.print("Opção: ");
            escolha = sc.nextInt();
            
            switch (escolha) {
                    case 1 -> ex01();
                    case 2 -> ex02();
                    case 3 -> ex03();
                    case 4 -> ex04();
                    case 5 -> ex05();
                    case 6 -> ex06();
                    case 7 -> ex07();
                    case 8 -> ex08();
                    case 9 -> ex09();
                    case 10 -> ex10();
                    case 11 -> ex11();
                    case 12 -> ex12();
                    case 13 -> ex13();
                    case 14 -> ex14();
                    case 15 -> ex15();
                    case 16 -> ex16();
                    case 17 -> ex17();
                    case 18 -> ex18();
                    case 19 -> ex19();
                    case 20 -> ex20();
                    case 21 -> ex21();
                    case 22 -> ex22();
                    case 23 -> ex23();
                    case 0 -> System.out.println("Encerrando programa...");
                    default -> System.out.println("Opção inválida!");
                }
        } while (escolha != 0);
    }

    public static void ex01 () {
        char caractere;
        int contador = 0;
        do { 
            System.out.println("Digite um ou vários caracteres: ");
            caractere = sc.next().charAt(0);
            contador++;
        } while (caractere != '.');
        System.out.printf("Foram digitados %d caracteres", --contador);
        System.out.println("\n\nAperte Enter para voltar para o menu...");
        sc.nextLine();
    }

    public static void ex02() {
        String palavra;
        int qtdVogais = 0;
        sc.nextLine(); // Limpando buffer
        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine().toLowerCase();
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                qtdVogais++;
            } 
        }
        System.out.printf("Quantidade de vogais da palavra \"%s\": %d", palavra, qtdVogais);
    }

    public static void ex03(){
        String palavra;
        int reps;
        
        System.out.println("Digite uma palavra");
        palavra = sc.nextLine();

        System.out.println("Quantas vezes quer ver ela sendo repetida?");
        reps = sc.nextInt();

        for(int i = 0; i < reps; i++){
            System.out.println(palavra);
        }
    }

    public static void ex04(){
        System.out.print("Digite uma frase (ou 'sair' para encerrar): ");
        String frase = sc.nextLine();

        while (!frase.equalsIgnoreCase("sair")) {
            System.out.println("Você digitou: " + frase);

            System.out.print("Digite outra frase (ou 'sair' para encerrar): ");
            frase = sc.nextLine();
        }

        System.out.println("Programa encerrado.");
    }

    public static void ex05(){
        System.out.println("Digite um nome: ");
        String nome = sc.nextLine();

        while (nome.length() < 3){
            System.err.println("O nome precisa ter pelo menos 3 letras.");
            System.out.println("Digite um nome novamente:");
            nome = sc.nextLine();
        }

        System.out.println("Nome aceito: " + nome);
    }

    public static void ex06(){
        System.out.println("Digite uma senha");
        String senha = sc.nextLine();
        System.out.println("Insira sua senha novamente...");
        String confirmacao = sc.nextLine();

        while (!senha.equals(confirmacao)){
            System.err.println("Senha incorreta!");

            System.out.println("Digite sua senha novamente...");
            confirmacao = sc.nextLine();
        }

        System.out.println("Senha correta !!");
    }

    public static void ex07(){
        int senha = 808, tentativas = 5, sugestao;
        System.out.println("Você tem 5 tentativas para decifrar um número de 3 digitos");
        System.out.println("Digite sua sugestão: ");
        sugestao = sc.nextInt();

        while (senha != sugestao || tentativas < 0){
            System.err.println("Errado...");
            tentativas--;
            System.out.println("Você agora tem " + tentativas + " restantes...");

            System.out.println("Digite sua sugestão: ");
            sugestao = sc.nextInt();
            
            if(tentativas == 0){
                System.err.println("Suas tentativas acabaram");
                break;
            }
        }
        System.out.println("Senha correta era: " + senha);
    }

    public static void ex08(){
        System.out.println("Vote nos três candidatos:");
        System.out.println("1- sim");
        System.out.println("2 - não");
        System.out.println("3 - talvez");
        int candidato = sc.nextInt();
        int total1 = 0, total2 = 0, total3 = 0;
        
        while(candidato != 4){
            switch(candidato){
                case 1 -> total1++;
                case 2 -> total2++;
                case 3 -> total3++;
                default -> System.err.println("Opção Inválida");
            }
            System.out.println("Vote Novamente !");
            System.out.println("1- sim");
            System.out.println("2 - não");
            System.out.println("3 - talvez");
            System.out.println("4 - ver os resultados");
            candidato = sc.nextInt();
        }

        System.out.println("Os resultados foram:");
        System.out.println("Votaram no Sim: " + total1);
        System.out.println("Votaram no não: " + total2);
        System.out.println("Votaram no talvez: " + total3);
    }

    public static void ex09(){
        double saque;
        boolean continuar = true;

        System.out.println("Quanto de saldo você tem?");
        double saldo = sc.nextDouble();

        while (saldo > 0 && continuar) {
            System.out.printf("%nSaldo atual: R$ %.2f%n", saldo);
            System.out.print("Digite o valor do saque (0 para sair): ");
            saque = sc.nextDouble();

            if (saque == 0) {
                continuar = false;
            } else if (saque < 0) {
                System.out.println("Digite um valor positivo.");
            } else if (saque > saldo) {
                System.out.println("Saldo insuficiente!");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso!");
            }
        }

        System.out.printf("%nSaldo final: R$ %.2f%n", saldo);
        System.out.println("Caixa eletrônico encerrado.");
    }

    public static void ex10(){
        String resposta = "mocha";
        System.out.println("Qual era para ser (e deveria ter sido) o nome original do Javascript?");
        String tentativa = sc.nextLine();

        while(!resposta.equalsIgnoreCase(tentativa)){
            System.err.println("Errado!");

            System.out.println("\nTente novamente:");
            tentativa = sc.nextLine();
        }

        System.out.println("Deveria ter sido mesmo...");
    }

    public static void ex11(){
        System.out.println("Digite seu CPF");
        int CPF = sc.nextInt();

        while(CPF > 11){
            System.err.println("CPF inválido");
            System.out.println("Digite seu CPF novamente");
            CPF = sc.nextInt();
        }

        System.out.println("CPF aceito!");
        System.out.println("Seu CPF é: " + CPF);
    }

    public static void ex12(){
        int resposta;
        int acertos = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Quanto é " + i + " + " + i + "?");
            System.out.print("Sua resposta: ");
            resposta = sc.nextInt();

            if (resposta == i + i) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " de 5 perguntas.");
    }

    public static void ex13(){
        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        System.out.println("Quantas vezes quer ver ela sendo repetida?");
        int reps = sc.nextInt();

        for(int i=0; i< reps; i++){
            System.out.print(palavra);
        }
    }

    public static void ex14(){
        Random aleatorio = new Random();
        System.out.println("De repente, você foi atacado por um dragão que soltou seu bafo infernal contra sua pessoa!!! (10/6)");

        int resultadoTotal = 0;

        for (int i = 1; i <= 10; i++) {
            int resultado = aleatorio.nextInt(6) + 1;

            System.out.println("Lançamento " + i + ": " + resultado);
            
            resultadoTotal += resultado;
        }

        System.out.println("Você tomou um total de: " + resultadoTotal);        

        if (resultadoTotal > 42)
            System.out.println("Tragicamente falecendo :(((");
        else
            System.out.println("Mas conseguiu sobreviver !!!");
    }

    public static void ex15(){
        int op = 0;

        while(op != 4){
            System.out.println("Menu");
            System.out.println("1 -");
            System.out.println("2 -");
            System.out.println("3 -");
            System.out.println("4 -");
            op = sc.nextInt();
        }
    }

    public static void ex16(){
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

