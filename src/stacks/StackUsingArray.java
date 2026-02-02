package stacks;

public class StackUsingArray {
    static int []stack = new int[5];
    static int top = -1;

    // push
    public static void push(int data){
        if (top == stack.length-1){
            System.out.println("Stack overflow");
        }
        top++;
        stack[top] = data;
    }

    // pop
    public static void pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Pop Element : "+stack[top]);
        top--;
    }

    // peek
    public static void peek(){
        if (top == -1){
            System.out.println("Stack is empty");
        }
        System.out.println("Peek Element of stack : "+stack[top]);
    }

    // display
    public static void display(){
        if (top == -1){
            System.out.println("Stack is empty");
        }

//        for (int i=top; i >=0; i--){
//            System.out.print(stack[i]+" ");
//        }

        for (int i=0; i<=top; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        push(10);
        push(20);
        push(71);
        display();          //  71 20 10
        peek();             //  71
        pop();              //  71
        display();          //  20 10
        peek();             // 20
    }
}
