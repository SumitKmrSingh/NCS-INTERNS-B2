package array;

public class RemoveFrontElement {
    public static int[] removeFrontElement(int []brr){
        int []newArr = new int[brr.length-1];
        for (int i=0; i<brr.length-1; i++){
            newArr[i] = brr[i+1];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        System.out.print("Array Elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int []newArr = removeFrontElement(arr);
        System.out.print("Array after front deletion : ");
        for (int x : newArr){
            System.out.print(x+" ");
        }
    }
}
