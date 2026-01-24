package loops;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1, 2, 5, 6, 8, 9};

        // for loop
        System.out.println("Print array using for loop : ");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // for each loop
        System.out.println("Print array using for each loop : ");
        for (int x : arr){
            System.out.println(x);
        }


//        for (int i=1;;){
//            System.out.println(i);
//        }
    }
}
