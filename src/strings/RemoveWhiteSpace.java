package strings;

public class RemoveWhiteSpace {
    public static String getWithoutWhiteSpace(String str){
        String res="";
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                res = res + str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="a b c d";
        System.out.println("original String : "+str);
        String result =getWithoutWhiteSpace(str);
        System.out.println("String after removing whitespace : "+result);
    }
}
