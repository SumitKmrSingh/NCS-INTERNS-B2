package patterns;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int row = sc.nextInt();

        // Logic of square pattern
        for(int i=1; i<=row; i++){
            // Space
            for (int space=1; space<=(row-i); space++){
                System.out.print(" ");
            }

            // Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
