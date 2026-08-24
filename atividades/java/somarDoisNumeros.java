
import java.util.Scanner;

public class somarDoisNumeros {
    public static void main(String[] args) {
        //variáveis
        double num1, num2, soma;
        Scanner leiteiro = new Scanner(System.in);
        System.out.println("Informe o número");
        num1 = leiteiro.nextDouble();
        System.out.println("Informe o outro número");
        num2 = leiteiro.nextDouble();
        soma = num1 + num2;
        System.out.println( "resultado é: " + soma);
    }
}
