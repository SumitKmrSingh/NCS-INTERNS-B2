package patterns;

import java.util.Scanner;

public class InvertedRightAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int row = sc.nextInt();

        // Logic of square pattern
        for(int i=1; i<=row; i++){
            for(int j=1; j<=(row-i+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
