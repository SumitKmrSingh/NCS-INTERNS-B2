package loops;

import java.util.Scanner;

public class SquarePatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row=4;

        // Square Patterns
        for(int i=1; i<=row; i++){
            for(int j=1; j<= row; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
