package recursion;

public class CalStringLength {
    public static int getStringLength(String str, int idx){
       // Base Case
        if (idx == str.length()){
            return 0;
        }

        // Recursive relation
        return 1+getStringLength(str, idx+1);
    }
    public static void main(String[] args) {
        String str = "Sumit";
        System.out.println(getStringLength(str, 0));
    }
}
