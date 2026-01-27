package patterns;

import java.util.Scanner;

public class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row no : ");
        int row = sc.nextInt();

        // first half
        for (int i=row; i>0; i--){
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            for (int space=1; space<=2*(row-i); space++){
                System.out.print(" ");
            }

            // star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        for (int i=1; i<=row; i++){
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            for (int space=1; space<=2*(row-i); space++){
                System.out.print(" ");
            }

            // star
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
