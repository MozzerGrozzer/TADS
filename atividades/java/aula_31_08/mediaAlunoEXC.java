import java.util.Scanner;

public class mediaAlunoEXC {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe as notas");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        media = (n1 + n2)/2;
        // decidir media
        if (media >= 6.0) {
            System.out.println("Aluno Aprovado");
        }
        else {
            System.out.println("Reprovado kakakakakkakakakak !!!");
        }
        //tmb pode ser escrito como:
        // System.out.printLn(media >= 6 ? "aprovado" : "reprovado");
    }
}