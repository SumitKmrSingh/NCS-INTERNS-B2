package recursion;

import java.util.Scanner;

public class PrintFirstNnaturalNumber {
    public static void printNNaturalNumber(int num){
        // Base case
        if(num == 0){
            return;
        }
        printNNaturalNumber(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        printNNaturalNumber(num);
    }
}
