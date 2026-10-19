import java.util.Scanner;

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
        System.out.println("\n\nAperte Enter para voltar para o menu...");
        sc.nextLine();
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
}

