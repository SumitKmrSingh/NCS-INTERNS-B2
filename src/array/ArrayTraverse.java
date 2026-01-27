package array;

import java.util.Scanner;

public class ArrayTraverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of an array : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Using for loop
        System.out.print("Printing Array elements Using for loop : ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Using for each loop
        System.out.print("Printing Array elements Using for each loop : ");
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}