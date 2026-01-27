package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;

        System.out.println("Print number from 1 to 5");

        // while loop
        while (num <= 5){
            System.out.println(num);
            num++;
        }

        System.out.println("Print number from 5 to 1");
        int i=5;
        while (i>=1){
            System.out.println(i--);

        }

        // Infinite loops
        int idx=1;
        while (idx<=10) {
            System.out.println(idx);
        }



    }
}
