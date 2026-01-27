package ArrayLists;

import java.util.List;
import java.util.ArrayList;

public class StringStartsWithAChar {
    public static int getStringStartWithA(List<String> list){
        int count=0;
        for(String str : list){
            if(str.charAt(0)=='A' || str.charAt(0)=='a'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sumit");
        list.add("Archita");
        list.add("Shafaqua");
        list.add("Ajay");
        list.add("Ankur");
        list.add("Himanshu");
        list.add("Abhay");

        System.out.println(list);
        int count=getStringStartWithA(list);
        System.out.println(count);
    }
}
