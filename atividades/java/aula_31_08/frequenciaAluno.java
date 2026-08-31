import java.util.Scanner;

public class frequenciaAluno {
    public static void main(String[] args) {
        double nota, frequencia;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua nota");
        nota = sc.nextDouble();
        System.out.println("Informe sua frequencia em sala de aula");
        frequencia = sc.nextDouble();
        if (frequencia > 75){
            System.out.println("Reprovado akakakakakaka");
        }
        else if (nota > 5.6) {
            System.out.println("aluno aprovado");
        }
        else if (nota >= 3){
            System.out.println("Recuperação malandro");
        }
        else if (nota >= 2){
            System.out.println("Aluno no rea eu não sei oq é isso");
        }
        else {
            System.out.println("Se fudeu.");
        }
    }
}
