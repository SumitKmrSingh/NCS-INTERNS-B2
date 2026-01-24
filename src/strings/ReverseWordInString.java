package strings;

public class ReverseWordInString {
    public static String reverseWords(String s) {
        // Code here
        String []words = s.split("\\.");
        String result = "";
        System.out.println("Length : "+words.length);
        for(int i=words.length-1; i>=0; i--){
            result = result + words[i];
            if (i != 0){
                result = result + ".";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "i.like.this.program.very.much";
        String result = reverseWords(str);
        System.out.println(result);
    }
}
