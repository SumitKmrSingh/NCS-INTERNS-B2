package recursion;

import java.util.Scanner;

public class PrintDigitInNewLine {
    public static void printDigit(int num){
        // base case
        if(num == 0){
            return;
        }
        System.out.println(num%10);
        printDigit(num/10);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt();
        printDigit(num);
    }
}
