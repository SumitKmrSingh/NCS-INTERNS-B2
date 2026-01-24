package strings;

public class FirstNonRepeatingCharacter {
    public static char getFirstNonRepeatingCharacter(String str){
        char ans='$';
        char []arr = str.toCharArray();
        int []freq = new int[26];

        for (char ch : arr){
            freq[ch-'a']++;
        }

        for (char ch : arr){
            if (freq[ch-'a'] == 1){
                ans=ch;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char ans = getFirstNonRepeatingCharacter(str);
        System.out.println(ans);
    }
}

