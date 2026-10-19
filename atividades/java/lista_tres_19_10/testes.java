import java.util.Scanner;
// 11    Peça CPF até que seja digitado com exatamente 11 dígitos.

public class testes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu CPF");
        int CPF = sc.nextInt();

        while(CPF < 11){
            System.err.println("CPF inválido");
            System.out.println("Digite seu CPF novamente");
            CPF = sc.nextInt();
        }

        System.out.println(CPF);
    }
}
