package recursion;

public class RecursionDemo {
    public static int add(int num1, int num2){
        add(num1, num2);
        return num1 + num2;
    }
    public static void main(String[] args) {
        int sum = add(4, 5);
        System.out.println(sum);
    }
}
