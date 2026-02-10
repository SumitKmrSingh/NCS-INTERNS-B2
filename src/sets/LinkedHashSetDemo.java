package sets;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(10);
        set1.add(20);
        System.out.println(set1);

        for (int x : set1){
            System.out.print(x+" ");
        }
    }
}
