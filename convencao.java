
import java.util.Scanner;

public class convencao {
    public static void main(String[] args) {
        double celsius, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos graus está agora?");
        celsius = sc.nextDouble();
        resultado = celsius + 273.15;
        System.out.println( resultado + " Kelvin");
    }
}
