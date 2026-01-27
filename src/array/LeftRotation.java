package array;

public class LeftRotation {
    public static int[] leftRotation(int []arr, int r){
        // create temp array
        int []temp = new int[arr.length];
        int k=0;
        for (int i=r; i<arr.length; i++){
            temp[k] = arr[i];
            k++;
        }

        for (int i=0; i<r; i++){
            temp[k] = arr[i];
            k++;
        }

        // copy all the elements of temp array Into given array arr
//        for (int i=0; i<arr.length; i++){
//            arr[i] = temp[i];
//        }

        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        int r=2;
        System.out.print("Array Before Rotation : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int []result = leftRotation(arr, r);

        System.out.print("Array after Rotation : ");
        for (int x : result){
            System.out.print(x+" ");
        }
    }
}
