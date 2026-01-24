package recursion;

public class Palindrome {
    public static boolean isPalindrome(String str, int start, int end){
        // Base case
        if(start >= end){
            return true;
        }
//        boolean status = isPalindrome(str, start+1, end-1);
//        return str.charAt(start)==str.charAt(end) && status;
        return str.charAt(start)==str.charAt(end) && isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "maam";
        boolean isPalindrome = isPalindrome(str, 0, str.length()-1);
        if (isPalindrome){
            System.out.println(str+" is Palindrome");
        }
        else {
            System.out.println(str+" is not Palindrome");
        }
    }
}
