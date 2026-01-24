package array;

import java.util.Scanner;

public class SearchElement {
    public static int searchElement(int []arr, int search){
        for (int i=0; i< arr.length; i++){
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter "+size+" value In array : ");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        // search Elements
        System.out.print("Enter any number that you want to search In given array : ");
        int search = sc.nextInt();

        int index = searchElement(arr, search);

        System.out.println(index);

        if (index == -1){
            System.out.println("Given elements are not present In given array");
        }
        else {
            System.out.println(search+" is present at "+(index+1)+" at Index");
        }

    }
}
