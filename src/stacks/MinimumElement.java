package stacks;

import java.util.Stack;

public class MinimumElement {
    public static int getMinimumElement(Stack<Integer> st){
        int min=Integer.MAX_VALUE;
        while (!st.isEmpty()){
            if (min > st.peek()){
                min = st.peek();
            }
            st.pop();
        }
        return min;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(22);
        st.push(16);
        st.push(81);
        st.push(6);
        st.push(1);
        st.push(1);

        System.out.println("Minimum elements are : "+getMinimumElement(st));
    }
}
