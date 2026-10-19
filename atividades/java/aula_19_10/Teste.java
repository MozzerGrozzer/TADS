public class Teste {
    public static void main(String[] args) {
        int cont = 0;
        for(int i=0; i<10; i+=2)
            for(int j = i; j<10; j+=3)
                cont++;
        System.out.println(cont);
    }
}
