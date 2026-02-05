// Write a program to sort a stack using another stack


package stacks;

import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> st){
        Stack<Integer>temp = new Stack<>();

        while (!st.isEmpty()){
            int x=st.pop();

            while (!temp.isEmpty() && temp.peek() > x){
                st.push(temp.pop());
            }
            temp.push(x);
        }
        return temp;

    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(114);
        stack.push(91);
        stack.push(96);
        stack.push(71);
        stack.push(99);

        System.out.println("Stack before Sorting : "+stack);
        stack = sortStack(stack);
        System.out.println("Stack after Sorting : "+stack);

    }
}
