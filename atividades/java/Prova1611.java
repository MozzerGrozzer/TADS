/*
1. Cadastro

Ao iniciar, o programa deverá solicitar a quantidade de livros que será cadastrada. A quantidade informada deverá estar entre 1000 e 5000.
Para cada livro deverão ser informados:

	1.	Título
	2.	Ano de publicação
	3.	Quantidade de páginas
	4.	Quantidade de empréstimos realizados
	5.	Quantidade de devoluções realizadas

Utilize um gerador de valores aleatórios para todos os preenchimentos desta etapa, respeitando as seguintes regras:
	•	A quantidade mínima de páginas é 50 e a máxima é 1500
	•	As quantidades de empréstimos e devoluções não podem ser negativas
	•	A quantidade de devoluções não pode ser maior que a quantidade de empréstimos
	•	O ano de publicação deve estar entre 1950 e 2025

Após o cadastro, o programa deve apresentar o seguinte menu:
1.	Listar livros
2.	livro mais emprestado
3.	livro menos emprestado
4.	Média de empréstimos
5.	livros acima da média de empréstimos
6.	Estatísticas
7.	Buscar livro pelo título
8.	Encerrar
O menu deve ser exibido até que o usuário escolha a opção "Encerrar".
O usuário deve ser informado em caso de opção inválida.

*/

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prova1611 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreadLocalRandom aleatorio = ThreadLocalRandom.current();

        int quantidade = lerQuantidadeLivros(scanner);

        // Arrays paralelos: os dados de um livro usam o mesmo índice.
        String[] titulos = new String[quantidade];
        int[] anos = new int[quantidade];
        int[] paginas = new int[quantidade];
        int[] emprestimos = new int[quantidade];
        int[] devolucoes = new int[quantidade];

        cadastrarLivros(
                titulos, anos, paginas, emprestimos, devolucoes, aleatorio
        );

        int opcao;

        do {
            exibirMenu();
            opcao = lerInteiro(scanner, "Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    listarLivros(titulos, anos, paginas, emprestimos, devolucoes);
                    break;
                case 2:
                    mostrarMaisEmprestados(titulos, anos, paginas, emprestimos, devolucoes);
                    break;
                case 3:
                    mostrarMenosEmprestados(titulos, anos, paginas, emprestimos, devolucoes);
                    break;
                case 4:
                    mostrarMediaEmprestimos(emprestimos);
                    break;
                case 5:
                    mostrarAcimaDaMedia(titulos, anos, paginas, emprestimos, devolucoes);
                    break;
                case 6:
                    mostrarEstatisticas(anos, emprestimos, devolucoes);
                    break;
                case 7:
                    buscarLivro(scanner, titulos, anos, paginas, emprestimos, devolucoes);
                    break;
                case 8:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha uma opção de 1 a 8.");
            }
        } while (opcao != 8);

        scanner.close();
    }

    static int lerQuantidadeLivros(Scanner scanner) {
        int quantidade;

        do {
            quantidade = lerInteiro(
                    scanner, "Informe a quantidade de livros (1000 a 5000): "
            );

            if (quantidade < 1000 || quantidade > 5000) {
                System.out.println("A quantidade deve estar entre 1000 e 5000.");
            }
        } while (quantidade < 1000 || quantidade > 5000);

        return quantidade;
    }

    static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    static void cadastrarLivros(
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes,
            ThreadLocalRandom aleatorio
    ) {
        for (int i = 0; i < titulos.length; i++) {
            titulos[i] = "Livro " + (i + 1);
            anos[i] = aleatorio.nextInt(1950, 2026);
            paginas[i] = aleatorio.nextInt(50, 1501);

            // O enunciado não define limite máximo para empréstimos.
            // Neste exemplo, são gerados valores entre 0 e 1000.
            emprestimos[i] = aleatorio.nextInt(0, 1001);

            // Devoluções entre 0 e a quantidade de empréstimos.
            devolucoes[i] = aleatorio.nextInt(0, emprestimos[i] + 1);
        }

        System.out.println(quantidadeMensagem(titulos.length));
    }

    static String quantidadeMensagem(int quantidade) {
        return quantidade + " livros cadastrados.";
    }

    static void exibirMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Listar livros");
        System.out.println("2. Livro mais emprestado");
        System.out.println("3. Livro menos emprestado");
        System.out.println("4. Média de empréstimos");
        System.out.println("5. Livros acima da média de empréstimos");
        System.out.println("6. Estatísticas");
        System.out.println("7. Buscar livro pelo título");
        System.out.println("8. Encerrar");
    }

    static void listarLivros(
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        for (int i = 0; i < titulos.length; i++) {
            exibirInformacoesLivro( i, titulos, anos, paginas, emprestimos, devolucoes);
        }
    }

    static void exibirInformacoesLivro(
            int indice,
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        int pendentes = emprestimos[indice] - devolucoes[indice];

        System.out.println(
                "\nTítulo: " + titulos[indice]
                + "\nAno de publicação: " + anos[indice]
                + "\nQuantidade de páginas: " + paginas[indice]
                + "\nQuantidade de empréstimos: " + emprestimos[indice]
                + "\nQuantidade de devoluções: " + devolucoes[indice]
                + "\nEmpréstimos pendentes: " + pendentes
        );
    }

    static void mostrarMaisEmprestados(
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        int maior = emprestimos[0];

        for (int i = 1; i < emprestimos.length; i++) {
            if (emprestimos[i] > maior) {
                maior = emprestimos[i];
            }
        }

        System.out.println("\nLivro(s) com mais empréstimos (" + maior + "):");

        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == maior) {
                exibirInformacoesLivro(
                        i, titulos, anos, paginas, emprestimos, devolucoes
                );
            }
        }
    }

    static void mostrarMenosEmprestados(
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        int menor = emprestimos[0];

        for (int i = 1; i < emprestimos.length; i++) {
            if (emprestimos[i] < menor) {
                menor = emprestimos[i];
            }
        }

        System.out.println("\nLivro(s) com menos empréstimos (" + menor + "):");

        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] == menor) {
                exibirInformacoesLivro(
                        i, titulos, anos, paginas, emprestimos, devolucoes
                );
            }
        }
    }

    static double calcularMediaEmprestimos(int[] emprestimos) {
        int total = 0;

        for (int quantidade : emprestimos) {
            total += quantidade;
        }

        return (double) total / emprestimos.length;
    }

    static void mostrarMediaEmprestimos(int[] emprestimos) {
        double media = calcularMediaEmprestimos(emprestimos);
        System.out.printf("\nMédia de empréstimos: %.2f%n", media);
    }

    static void mostrarAcimaDaMedia(
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        double media = calcularMediaEmprestimos(emprestimos);
        boolean encontrou = false;

        System.out.printf("\nLivros com empréstimos acima da média (%.2f):%n", media);

        for (int i = 0; i < emprestimos.length; i++) {
            if (emprestimos[i] > media) {
                exibirInformacoesLivro(i, titulos, anos, paginas, emprestimos, devolucoes);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("\nNenhum livro está acima da média.");
        }
    }

    static void mostrarEstatisticas(
            int[] anos,
            int[] emprestimos,
            int[] devolucoes
    ) {
        int anoMaisAntigo = anos[0];
        int anoMaisRecente = anos[0];
        int somaAnos = 0;
        int totalEmprestimos = 0;
        int totalDevolucoes = 0;
        int livrosComMaisDe100Emprestimos = 0;

        for (int i = 0; i < anos.length; i++) {
            if (anos[i] < anoMaisAntigo) {
                anoMaisAntigo = anos[i];
            }

            if (anos[i] > anoMaisRecente) {
                anoMaisRecente = anos[i];
            }

            somaAnos += anos[i];
            totalEmprestimos += emprestimos[i];
            totalDevolucoes += devolucoes[i];

            if (emprestimos[i] > 100) {
                livrosComMaisDe100Emprestimos++;
            }
        }

        double mediaAnos = (double) somaAnos / anos.length;
        double percentual = 100.0 * livrosComMaisDe100Emprestimos / anos.length;

        System.out.println("\n===== ESTATÍSTICAS =====");
        System.out.println("Ano de publicação mais antigo: " + anoMaisAntigo);
        System.out.println("Ano de publicação mais recente: " + anoMaisRecente);
        System.out.printf("Média dos anos de publicação: %.2f%n", mediaAnos);
        System.out.println("Total de empréstimos realizados: " + totalEmprestimos);
        System.out.println("Total de devoluções realizadas: " + totalDevolucoes);
        System.out.printf(
                "Percentual de livros com mais de 100 empréstimos: %.2f%%%n",
                percentual
        );
    }

    static void buscarLivro(
            Scanner scanner,
            String[] titulos,
            int[] anos,
            int[] paginas,
            int[] emprestimos,
            int[] devolucoes
    ) {
        System.out.print("\nDigite o título do livro (por exemplo, Livro 25): ");
        String tituloBuscado = scanner.nextLine().trim();

        for (int i = 0; i < titulos.length; i++) {
            if (titulos[i].equalsIgnoreCase(tituloBuscado)) {
                System.out.println("\nLivro encontrado:");
                exibirInformacoesLivro(i, titulos, anos, paginas, emprestimos, devolucoes);
                return;
            }
        }

        System.out.println("Livro não localizado.");
    }
}