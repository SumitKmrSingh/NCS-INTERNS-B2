package array;

public class EqualPartionsOfArray {
    public static boolean isPartion(int []arr){
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum = totalSum + arr[i];
        }
        int prefix=0;
        for (int i=0; i<arr.length; i++){
            prefix = prefix + arr[i];
            int suffix = totalSum - prefix;
            if (prefix == suffix){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []arr = {15, 5, 6, 4, 8, 2};
        System.out.println(isPartion(arr));
    }
}
