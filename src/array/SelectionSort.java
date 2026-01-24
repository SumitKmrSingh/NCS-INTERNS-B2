package array;

public class SelectionSort {
    public static void getSelectionSort(int []arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Array after Sorted : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int []arr = {4, 96, 9, 8, 46, 91};
        System.out.print("Array Before Sorted : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        getSelectionSort(arr);
    }
}
