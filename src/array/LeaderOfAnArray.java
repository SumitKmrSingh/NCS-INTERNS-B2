package array;

public class LeaderOfAnArray {
    public static void getLeader(int []arr){
        System.out.print("Leader of an array are : ");
        int maxRight=Integer.MIN_VALUE;
        for (int i=arr.length-1; i>=0; i--){
            if (arr[i] > maxRight){
                System.out.print(arr[i]+" ");
                maxRight = arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {61, 61, 17};
        System.out.print("Array elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        getLeader(arr);
    }
}
