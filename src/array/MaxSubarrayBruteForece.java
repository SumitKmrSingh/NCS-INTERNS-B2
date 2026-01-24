package array;

public class MaxSubarrayBruteForece {
    public static int getMaxSubarraySum(int []arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int sum=0;
                for (int k=i; k<=j; k++){
                    sum = sum + arr[k];
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Array elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int maxSum = getMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum :  "+maxSum);
    }
}
