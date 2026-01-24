package array;

public class MissingNumber {
    public static int getMissingNumber(int []arr, int num){
        int sum=0;

        // sum of n natural number
        for (int i=1; i<=num; i++){
            sum = sum + i;
        }

        // sum of array elements
        int arrSum=0;
        for (int i=0; i<arr.length; i++){
            arrSum = arrSum + arr[i];
        }

        // getting missing number
        int missingNum = sum - arrSum;
        return missingNum;
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int missingNum = getMissingNumber(arr, 10);
        System.out.println("Missing number : "+missingNum);

    }
}
