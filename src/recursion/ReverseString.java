package recursion;

public class ReverseString {
    public static String getReverse(String str, int idx){
        // Base Case
        if(idx == str.length()){
            return "";
        }

        // Recursive work
        String smallAns = getReverse(str, idx+1);

        // Self work
        return smallAns + str.charAt(idx);
    }
    public static void main(String[] args) {
        String str="Sumit";
        String reverse = getReverse(str, 0);
        System.out.println(reverse);
    }
}
