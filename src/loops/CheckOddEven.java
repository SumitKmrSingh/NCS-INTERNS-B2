package loops;

import java.util.Scanner;

public class CheckOddEven {
    public static String getEvenOdd(int num){
        if (num%2 == 0){
            return "even";
        }
        else {
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();

        String result = getEvenOdd(num);
        System.out.println(result);
    }
}
