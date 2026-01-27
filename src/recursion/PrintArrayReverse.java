package recursion;

public class PrintArrayReverse {
    public static void printArrayInReverseOrder(int []arr, int idx){
        int n=arr.length;
        // Base Case
        if (idx == n-1){
            System.out.print(arr[idx]+" ");
            return;
        }

        // Recursive Relation
        printArrayInReverseOrder(arr, idx+1);

        // Processing
        System.out.print(arr[idx]+" ");
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        printArrayInReverseOrder(arr, 0);
    }
}
