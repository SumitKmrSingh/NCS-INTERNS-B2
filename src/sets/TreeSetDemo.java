package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(5);
        set1.add(5);
        set1.add(20);
        set1.add(21);
        set1.add(3);

        System.out.println(set1);

        for (int x : set1){
            System.out.print(x+" ");
        }
    }
}
