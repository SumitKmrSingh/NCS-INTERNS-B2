package ArrayLists;

import exceptions.customExceptions.InvalidIndexException;

import java.util.ArrayList;

public class customArrayList {
    private int[] list;
    private int size;

    customArrayList(){
        list = new int[10];
        size=0;
    }

    //add element at end
    public void add(int element){
        checkCapactity();
        list[size] = element;
        size++;
    }

    // adds an element at a specific index
    public void add(int idx, int element){
        checkIndexForAdd(idx);
        checkCapactity();
        for (int i=size; i>idx; i--){
            list[i] = list[i-1];
        }
        list[idx]=element;
        size++;
    }

    // Returns element at given index
    public int get(int index){
        checkValidIndex(index);
        return list[index];
    }

    // removes element at given index
    public int remove(int index){
        checkValidIndex(index);
        int remove = list[index];
        for (int i=index; i<size-1; i++){
            list[i] = list[i+1];
        }
        size--;
        return remove;
    }

    // returns number of elements
    public int size(){
        return size;
    }

    // Checks whether list is empty
    public boolean isEmpty(){
//        if(size==0){
//            return true;
//        }
//        return false;

        return size==0;
    }

    // Displays all elements
    public void display(){
        System.out.print("[");
        for (int i=0; i<size; i++){
            System.out.print(list[i]);
            if (i < size-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private void checkValidIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid Index : "+index);
        }
    }

    private void checkIndexForAdd(int idx){
        if (idx < 0 || idx > size){
            throw new IndexOutOfBoundsException("Index : "+idx);
        }
    }

    private void checkCapactity(){
        if (list.length == size){
            int []newArr = new int[list.length*2];
            for (int i=0; i<list.length; i++){
                newArr[i] = list[i];
            }
            list = newArr;
        }
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        System.out.println(list1);

        customArrayList list = new customArrayList();
        System.out.println(list.isEmpty());  // true
        list.add(10);
        list.add(20);
        list.add(30);
        list.display();     // [10, 20, 30]
        list.add(1, 22);
        System.out.println();
        list.display();         // [10, 22, 20, 30]
        list.remove(1);
        list.display();         // [10, 20, 30]
        System.out.println(list.size);   // 3
        System.out.println(list.isEmpty());   // false;


//        System.out.println(list.size);
    }
}
