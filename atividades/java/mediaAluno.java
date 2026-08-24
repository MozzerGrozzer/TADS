import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual foi sua primeira nota???");
        nota1 = sc.nextDouble();
        System.out.println("Qual foi sua segunda nota???");
        nota2 = sc.nextDouble();
        System.out.println("Qual foi sua terceira nota???");
        nota3 = sc.nextDouble();
        System.out.println("Qual foi sua quarta nota???");
        nota4 = sc.nextDouble();
        soma = (nota1 + nota2 + nota3 + nota4)/4.0;
        System.out.println("Parabens " + nome + " sua média é de: " + soma);
    }
}
