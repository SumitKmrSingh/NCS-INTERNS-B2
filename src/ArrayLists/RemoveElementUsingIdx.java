// 6.	Remove an element from an ArrayList using index.

package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElementUsingIdx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);

        Scanner sc = new Scanner(System.in);
        System.out.print("Total no of elements you want to add In arrayList : ");
        int size = sc.nextInt();

        for (int i=0; i<size; i++){
            System.out.print("Enter "+(i+1)+" In arrayList : ");
            int num = sc.nextInt();
            list.add(num);
        }

//        list.remove(2);
//        System.out.println(list);

        for (int x : list){
            System.out.print(x+" ");
        }
//
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }


    }
}
