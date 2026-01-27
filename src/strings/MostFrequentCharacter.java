package strings;

import java.util.Arrays;

public class MostFrequentCharacter {
    public static char getMostFreqChar(String str){
        char []arr = str.toCharArray();
        Arrays.sort(arr);  //   nlog(n)
        int i=0;
        int j=0;
        int freq=-1;
        char ans=str.charAt(0);
        int maxFreq = Integer.MIN_VALUE;
        for (j=0; j<arr.length; j++){
            if (arr[i] != arr[j]){
                freq=j-i;
                if(freq > maxFreq){
                    maxFreq=freq;
                    ans=arr[i];
                }
                i=j;
            }
        }
        freq=j-i;
        if(freq > maxFreq){
            maxFreq=freq;
            ans=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "testsample";
        char result = getMostFreqChar(str);
        System.out.println(result);
    }
}
