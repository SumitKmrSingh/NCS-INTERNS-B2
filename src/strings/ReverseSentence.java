package strings;

public class ReverseSentence {
    public static StringBuffer getReverseStringBuffer(String str){
        String []words = str.split(" ");
        StringBuffer reverse = new StringBuffer();
        for (int i=words.length-1; i>=0; i--){
            reverse.append(words[i]);
            if (i != 0){
                reverse.append(" ");
            }
        }
        return reverse;
    }
    public static String getReverse(String str){
        String []words = str.split(" ");
        String rev="";
        for (int i=words.length-1; i>=0; i--){
            rev = rev + words[i];
            if (i != 0){
                rev = rev + " ";
            }
        }
        return rev;
    }
    public static void main(String[] args) {
        String str = "mogambo khush hua";
        String result = getReverse(str);
        System.out.println(result);
    }
}
