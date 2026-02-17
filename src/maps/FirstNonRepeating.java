package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static Character getFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else {
                map.put(ch, 1);
            }
        }

        for (Character key : map.keySet()){
            if (map.get(key) == 1){
                return key;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String str = "stwiss";
        Character ans = getFirstNonRepeatingChar(str);
        System.out.println("First non-repeating Character : "+ans);
    }
}
