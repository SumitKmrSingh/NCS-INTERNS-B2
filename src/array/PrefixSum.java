package array;

public class PrefixSum {
    public static int[] getPrefixSumOptimizeConstantSpace(int []arr){
        // time : O(n)
        // space : O(1)
        for (int i=1; i< arr.length; i++) {
           arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static int[] getPrefixSumOptimize(int []arr){

        // time : O(n)
        // space : O(n)
        int []prefix = new int[arr.length];
        prefix[0]=arr[0];
        for (int i=1; i< arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
//    public static int[] getPrefixSum(int []arr){
    // time : O(n)
    // space : O(n)
//        int []result = new int[arr.length];
//        for (int i=0; i<arr.length; i++){
//            int sum=0;
//            for (int j=0; j<=i; j++){
//                sum = sum + arr[j];
//            }
//            result[i] = sum;
//        }
        // Prefix sum using extra array
//        int []prefix = new int[arr.length];
//        prefix[0] = arr[0];
//        for (int i=1; i<arr.length; i++){
//            prefix[i] = prefix[i-1] + arr[i];
//        }

        // Prefix sum without using extra array
//        for (int i=1; i<arr.length; i++){
//            arr[i] = arr[i-1] + arr[i];
//        }
//        return arr;
//    }
    public static void main(String[] args) {
        int []arr = {2, 4, 1, 3, 6, 5};
//        arr = getPrefixSum(arr);
//        arr = getPrefixSumOptimize(arr);
        arr = getPrefixSumOptimize(arr);
        System.out.print("Prefix sum of each elements In array : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
