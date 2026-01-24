package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class GetEvenNumber {
    public static List<Integer> getEvenNumber(List<Integer> list){
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int x : list){
            if (x%2 == 0){
                evenList.add(x);
            }
        }
        return evenList;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(62);

        list = getEvenNumber(list);
        System.out.println(list);
    }
}
