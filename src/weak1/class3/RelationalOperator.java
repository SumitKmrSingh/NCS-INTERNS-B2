package weak1.class3;

public class RelationalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=10;

        System.out.println(a==b);   // false
        System.out.println(a==c);   // true

        System.out.println(a>b);    // false
        System.out.println(a<b);    // true

        System.out.println(a!=b);   // true
        System.out.println(a!=c);   // false

        System.out.println(a>=b);   // false
        System.out.println(a<=c);   // true

    }
}
