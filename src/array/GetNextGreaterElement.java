package array;

public class GetNextGreaterElement {
    public static int[] getNextGreaterElements(int []arr){
        int []result = new int[arr.length];
        int idx=0;
        for (int i=0; i<arr.length; i++){
            boolean flag=false;
            for (int j=i+1; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    result[idx++]=arr[j];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                result[idx++]=-1;
            }
        }
        result[result.length-1]=-1;
        return result;
    }
    public static void main(String[] args) {
        int []arr = {5, 4, 3, 1};
        System.out.print("Array elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        arr = getNextGreaterElements(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
