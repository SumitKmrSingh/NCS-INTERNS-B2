package array;

public class MaximumElement {
    public static int getMaximumElement(int []arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr = {10, 14, 6, 9, 3};
        int maxElement = getMaximumElement(arr);
        System.out.println("Maximum elements "+maxElement);
    }
}
