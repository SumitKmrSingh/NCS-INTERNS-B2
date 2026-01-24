package strings;

public class CheckVowels {
    public static int getTotalVowels(String str){
        int countVowel=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e'
            || str.charAt(i) == 'I' || str.charAt(i) == 'i' || str.charAt(i) == 'O' || str.charAt(i) == 'o'
            || str.charAt(i) == 'U' || str.charAt(i) == 'u'){
                countVowel++;
            }
        }
        return countVowel;
    }
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int countVowel = getTotalVowels(str);
        System.out.println("Given String : "+str);
        System.out.println("Total Vowel In given String : "+countVowel);
    }
}
