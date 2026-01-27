package ArrayLists;

import java.util.List;
import java.util.ArrayList;

public class MergeTwoArrayList {
    public static List<Integer> mergeTwoList(List<Integer> list1, List<Integer> list2){
//        method 1
//        List<Integer> mergeTwoList = new ArrayList<>();
//        for (int x : list1){
//            mergeTwoList.add(x);
//        }
//        for (int x : list2){
//            mergeTwoList.add(x);
//        }
//        return mergeTwoList;

        // Method 2
//        for (int x : list1){
//            list2.add(x);
//        }
//        // list1 [10 20 71]
//        // list2 [40 50 61 10 20 71]
//        return list2;

        // Method 3
        for (int x : list2){
            list1.add(x);
        }
        return list1;
    }


    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(71);

        list2.add(40);
        list2.add(50);
        list2.add(61);

        List<Integer> mergeTwoList = mergeTwoList(list1, list2);
        System.out.println(mergeTwoList);


    }
}
