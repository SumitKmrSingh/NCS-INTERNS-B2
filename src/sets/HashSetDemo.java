package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(4);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(30);
        set2.add(40);

        for (int x : set1){
            if (!set2.contains(x)){
                System.out.println(x);
            }
        }

        for (int x : set2){
            if (!set1.contains(x)){
                System.out.println(x);
            }
        }

    }
}
