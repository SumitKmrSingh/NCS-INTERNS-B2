package weak1.class3;

public class UniaryOperator {
    public static void main(String[] args) {
//        int a=5;
//        System.out.println(++a);
//
//        int b=6;
//        System.out.println(++b);
//
//        int c=10;
//        System.out.println(++c);    //  11
//        System.out.println(c++);    //  11
//
//        System.out.println(++c + c);    //  21


        // 03/09/2025

        // Task 1
//        int a=10;
//        int result = ++a + a++;
//        System.out.println(result); //  22
//        System.out.println(a);  //  12

        // Task 2
//        int a=10;
//        int result = --a + a--;
//        System.out.println(result); //  18
//        System.out.println(a);  //  8

        //  Task 3
//        int a=20;
//        int result = ++a + (--a) + a;
//        System.out.println(result); //  61
//        System.out.println(a);  //  20

        // Task 4
//        int a=30;
//        int result = a-- + a-- + a;
//        System.out.println(result); //  87
//        System.out.println(a);  //  28

        //  Task 5
        int a=3;
        int b=4;
        int result = (++a * --b) + (b++ * a--) + (a+b);
        System.out.println(result); //  31
        System.out.println(a);  //  3
        System.out.println(b);  // 4





    }
}
