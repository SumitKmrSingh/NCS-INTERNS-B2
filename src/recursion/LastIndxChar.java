package recursion;

public class LastIndxChar {
    public static int getLastIdx(String str, char target, int idx){
        if (idx < 0){
            return -1;
        }
        if (str.charAt(idx) == target){
            return idx;
        }
        return getLastIdx(str, target, idx-1);
    }
    public static void main(String[] args) {
        String str = "ababbbc";
        char target = 'c';
        int idx = getLastIdx(str, target, str.length()-1);
        System.out.println(idx);
    }
}
