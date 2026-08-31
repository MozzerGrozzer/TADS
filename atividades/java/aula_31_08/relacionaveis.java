public class relacionaveis {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b=1;
        c=7;
        System.out.println(a == b && b>c);
        System.out.println(a != b || b<c );
        System.out.println(a>b);
        System.out.println(a != c && c>b);
        System.out.println(a>=b || c>b);
        System.out.println(c>a && b>a);
        System.out.println(b<c);
        System.out.println(a>c || a>b);
    }
}
