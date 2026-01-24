package weak1.class3;

public class BitwiseBinaryOperator {
    public static void main(String[] args) {
        int a=2;
        int b=5;

//        System.out.println(a&b);    //  0
//        System.out.println(b&a);    //  0
//
//        System.out.println(a^b);    //  7
//        System.out.println(b^a);    //  7
//
//        System.out.println(a|b);    //  7
//        System.out.println(b|a);    //  7

        int x=-9;
//        int y=1;
//
//        System.out.println(x<<y);

        int z=x>>2;
        System.out.println(Integer.toBinaryString(z));

        z=x>>>2;
        System.out.println(Integer.toBinaryString(z));
//        System.out.println(x>>>y);


    }
}
