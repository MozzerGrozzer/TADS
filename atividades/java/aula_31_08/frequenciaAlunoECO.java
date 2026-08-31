import java.util.Scanner;

public class frequenciaAlunoECO {
    public static void main(String[] args) {
        double nota, frequencia;
        String resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua nota");
        nota = sc.nextDouble();
        System.out.println("Informe sua frequencia em sala de aula");
        frequencia = sc.nextDouble();
        if (frequencia > 75){
            resultado = "Reprovado akakakakakaka";
        }
        else if (nota > 5.6) {
            resultado = "aluno aprovado";
        }
        else if (nota >= 3){
            resultado = "Recuperação malandro";
        }
        else if (nota >= 2){
            resultado = "Aluno no rea eu não sei oq é isso";
        }
        else {
            resultado = "Se fudeu.";
        }
        System.out.println(resultado);
    } // que fodaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
}
