import java.util.Scanner;

public class exemploString {
    public static void main(String[] args) {
        String turma;
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe sua turma");
        turma = ler.next();
        // string se compara com .equals()
        if (turma.equals("A")) {
            System.out.println("Bem vindo à turma A");
        }
        else {
            System.out.println("Xo Xo saia suma dessapareceça");
        }
    }
}
