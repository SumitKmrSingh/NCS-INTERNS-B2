package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static Set<Integer> removeDuplicates(int []arr){
        Set<Integer> set = new LinkedHashSet<>();
        for (int x : arr){
            set.add(x);
        }
        return set;
    }
    public static void main(String[] args) {
        int []arr = {5, 1, 3, 1, 5};

        Set<Integer> removeDuplicates = removeDuplicates(arr);
        for (int x : removeDuplicates){
            System.out.print(x+" ");
        }
    }
}
