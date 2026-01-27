package recursion;

public class PrintArrayElement {
    public static void printArray(int []arr, int idx){
        int n=arr.length;
        // Base Case
        if (idx == n-1){
            System.out.print(arr[idx]+" ");
            return;
        }

        // Processing
        System.out.print(arr[idx]+" ");

        // Recursive Relation
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        printArray(arr, 0);
    }
}
