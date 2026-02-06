package stacks;

import java.util.Stack;

public class StackPalindrome {
    public static boolean isPalindrome(int []arr){
        int start=0;
        int end=arr.length-1;
        while (start <= end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean isStackPalindrome(Stack<Integer> st){

        // Using array
//        int []arr = new int[st.size()];
//        int i=0;
//        while (!st.isEmpty()){
//            arr[i++] = st.pop();
//        }
//        if (isPalindrome(arr)){
//            return true;
//        }
//        return false;




        // Using stack

        Stack<Integer> temp = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        while (!st.isEmpty()){
            int data = st.pop();
            temp.push(data);
            st2.push(data);
        }

        while (!temp.isEmpty()){
            st.push(temp.pop());
        }

        int i=0;
        while (!st.isEmpty() && !st2.isEmpty() && i< st.size()/2 ){
            if (st.pop() != st2.pop()){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(2);
        st.push(1);

        boolean result = isStackPalindrome(st);
        System.out.println(result);
    }
}
