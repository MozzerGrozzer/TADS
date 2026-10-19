import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Repeticao{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int segredo, palpite = 0, tentativa = 0;
        segredo = rand.nextInt(1,1000);
        while(palpite != segredo ){ // && tentativa < 5
            System.out.println("Tente adivinhar o número sorteado");
            palpite = rand.nextInt(1,10000);
            tentativa++;
            Runtime.getRuntime().exec("notepad");
        }
        System.err.printf("%d tentativa(s)", tentativa);
        System.err.println("O número era:" + segredo);     
    }
}