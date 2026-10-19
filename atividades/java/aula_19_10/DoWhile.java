import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Informe um número entre 1 e 100");
            numero = ler.nextInt();
            if(numero < 1 || numero > 100){
                System.err.println("Valor Inválido");
                continue;
            } break;
        } while (true); 
    }
}
