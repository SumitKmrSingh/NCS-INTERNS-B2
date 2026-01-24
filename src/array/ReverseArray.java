package array;

public class ReverseArray {
    public static int[] getReverseArray(int []arr){
        int start=0;
        int end=arr.length-1;

//        while (start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }

//        while (start < end){
//            int a=arr[start];
//            int b=arr[end];
//            a = a+b;
//            b = a-b;
//            a = a-b;
//
//            arr[start]=a;
//            arr[end]=b;
//            start++;
//            end--;
//        }

        while(start < end){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Array Before Reverse : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr = getReverseArray(arr);
        System.out.print("Array ater Reverse : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
