// Print natural numbers from 1 to N using recursion.

package recursion;

import java.util.Scanner;

public class PrintingNnaturalNumber {
    public static void printN(int num){
        // Base Case
        if (num==0){
            return;
        }

        // Recursive Relation
        printN(num-1);

        // Self work
        System.out.print(num+" ");

    }

    public static void main(String[] args) {
        printN(10);
    }
}
