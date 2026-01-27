package ArrayLists;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        System.out.println("ArrayList Size : "+list.size());
        System.out.println("ArrayList Capacity : "+list.size());


        System.out.println(list);
    }
}
