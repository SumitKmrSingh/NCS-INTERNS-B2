package array;

public class CopyArray {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        int []copyArray = new int[arr.length];
        System.out.print("original array : ");
        for (int x : arr){
            System.out.print(x+" ");
        }

        // Copy of array logic
        System.out.println();
        for (int i=0; i<arr.length; i++){
            copyArray[i] = arr[i];
        }

        System.out.print("Copy array : ");
        for (int x : copyArray){
            System.out.print(x+" ");
        }
    }
}
