package array;

public class GetUniqueElement {
    public static int getUniqueElement(int []arr){
        int xor=0;
        for (int num : arr){
            xor = num^xor;
        }
        return xor;
    }
    public static void main(String[] args) {
        int []arr = {4, 1, 2, 1, 2};
        int uniqueElment = getUniqueElement(arr);
        System.out.println("Unique element : "+uniqueElment);
    }
}
