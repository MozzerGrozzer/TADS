import java.util.Scanner;

public class testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 808, tentativas = 5, sugestao;
        System.out.println("Você tem 5 tentativas para decifrar um número de 3 digitos");
        System.out.println("Digite sua sugestão: ");
        sugestao = sc.nextInt();

        while (senha != sugestao || tentativas < 0){
            System.err.println("Errado...");
            tentativas--;
            System.out.println("Você agora tem " + tentativas + " restantes...");

            System.out.println("Digite sua sugestão: ");
            sugestao = sc.nextInt();
            
            if(tentativas == 0){
                System.err.println("Suas tentativas acabaram");
                break;
            }
        }
        System.out.println("Senha correta era: " + senha);
    }
}
