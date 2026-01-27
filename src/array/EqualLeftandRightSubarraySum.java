package array;

public class EqualLeftandRightSubarraySum {
    public  static int equalSum(int[] arr) {
        // Write your code here
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum = totalSum + arr[i];
        }

        int prefisSum=0;
        for(int i=0; i<arr.length; i++){
            int suffixSum = totalSum-prefisSum-arr[i];
            if(prefisSum == suffixSum){
                return i;
            }
            prefisSum = prefisSum + arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {1, 3, 5, 2, 2};
        int result = equalSum(arr);
        System.out.println(result);
    }
}
