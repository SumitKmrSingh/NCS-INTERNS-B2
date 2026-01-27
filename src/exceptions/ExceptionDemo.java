package exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a = sc.nextInt();
        System.out.print("Enter any number: ");
        int b = sc.nextInt();
        try {
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e){
            System.out.println("Enter denominator greater than zero");
        }
        catch (Exception e){
            System.out.println("Inside Exception Block");
        }
    }
}
