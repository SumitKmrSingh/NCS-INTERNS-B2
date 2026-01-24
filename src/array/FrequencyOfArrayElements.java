package array;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

    // Method 1
    public static void getFrequency(int []arr){
        boolean []visited = new boolean[arr.length];
        for (int i=0; i<arr.length; i++){
            if(visited[i] == true){
                continue;
            }
            int count=1;
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+" -> "+count);
        }
    }

    // Method 2 (Using HashMap)
    public static void getFrequencyUsingHashMap(int []arr){
//        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
//        Map<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr){
            if (map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else {
                map.put(x, 1);
            }
        }

        System.out.println("Frequency of array element Using Hashmap : ");
        for (int x : map.keySet()){
            System.out.println(x+" -> "+ map.get(x));
        }
    }
    public static void main(String[] args) {
        int []arr = {10, 20, 10, 30, 40, 40, 10};
        System.out.print("Array Elements are : ");
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        getFrequency(arr);
        getFrequencyUsingHashMap(arr);
    }
}
