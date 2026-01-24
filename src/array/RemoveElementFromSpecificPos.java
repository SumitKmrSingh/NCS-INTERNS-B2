package array;

public class RemoveElementFromSpecificPos {
    public static int[] removeSpecificPosition(int []brr, int pos){
        int []newArr = new int[brr.length-1];
        for (int i=0; i<pos; i++){
            newArr[i] = brr[i];
        }
        for (int i=pos+1; i<brr.length; i++){
            newArr[i-1] = brr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
        int pos=2;
        System.out.print("Array Elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        int []newArr = removeSpecificPosition(arr, 2);
        System.out.print("Array after removing "+pos+" Index element : ");
        for (int x : newArr){
            System.out.print(x+" ");
        }
    }
}
