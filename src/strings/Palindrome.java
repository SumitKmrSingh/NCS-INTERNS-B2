package strings;

public class Palindrome {
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "maam";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome){
            System.out.println(str+" is Palindrome");
        }
        else {
            System.out.println(str+" is not Palindrome");
        }
    }
}
