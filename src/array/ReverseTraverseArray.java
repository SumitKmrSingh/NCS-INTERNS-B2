package array;

import java.util.Scanner;

public class ReverseTraverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.print("Enter all the elements of an array : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // printing array In reverse direction
        System.out.print("Printing array In reverse direction : ");
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}