package array;

public class EquilbriumIndex {
    public static int getEquilbriumIndex(int []arr){
        for (int i=0; i<arr.length; i++){
            int leftSum=0;
            int rightSum=0;

            // sum of all left element
            for (int j=0; j<i; j++){
                leftSum = leftSum + arr[j];
            }

            // sum of all right element
            for (int j=i+1; j<arr.length; j++){
                rightSum = rightSum + arr[j];
            }

            // check equilbrium Index
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {5, 2, 3, 2};
        int equilbrimIndex = getEquilbriumIndex(arr);
        if (equilbrimIndex != -1){
            System.out.println("Equilbrium Index : "+equilbrimIndex);
        }
        else {
            System.out.println("no equilibrium index");
        }
    }
}
