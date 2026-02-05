package stacks;

import java.util.Stack;

public class RemoveAllEvenElement {
    public static Stack<Integer> removeAllEvenElement(Stack<Integer> st){
        Stack<Integer> oddStack = new Stack<>();

        while (!st.isEmpty()){
            if (st.peek()%2 != 0){
                oddStack.push(st.peek());
            }
            st.pop();
        }

        return oddStack;
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

        System.out.println("Stack before removing Even element : "+stack);

        Stack<Integer> ans = removeAllEvenElement(stack);
        System.out.println("Stack after removing even element :  "+ans);

    }
}
