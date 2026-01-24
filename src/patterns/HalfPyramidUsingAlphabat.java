package patterns;

import java.util.Scanner;

public class HalfPyramidUsingAlphabat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int row = sc.nextInt();

        // Logic of square pattern
        for(int i=1; i<=row; i++){
            char ch='A';
            for(int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("Using ASSIC value");
        for(int i=1; i<=row; i++){
            int ch=65;
            for(int j=1; j<=i; j++){
                System.out.print((char) ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
