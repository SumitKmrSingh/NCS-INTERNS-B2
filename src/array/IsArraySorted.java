package array;

public class IsArraySorted {
    public static boolean isArraySorted(int []arr){
        for (int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {4, 8, 9, 46, 91, 96};
        System.out.print("Given array : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        boolean isSorted = isArraySorted(arr);
        if (isSorted){
            System.out.println("Given array Is sorted");
        }
        else {
            System.out.println("Given array Is not sorted");
        }
    }
}
