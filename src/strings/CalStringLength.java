package strings;

public class CalStringLength {
    public static int getStringLength(String str){
        char []chArray = str.toCharArray();
        int count=0;
//        for (int i=0; i<chArray.length; i++){
//            count++;
//        }

        for (char ch : chArray){
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "Sumit";
        System.out.println(getStringLength(str));
    }
}
