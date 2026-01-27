class Demo{
    void add(int num1, int num2, int num3){
        int sum = num1+num2+num3;
        System.out.println(sum);
    }
    int add(int num1, int num2){
        return num1+num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.add(4, 5, 6);
        int sum = obj.add(4, 5);
        System.out.println(sum);
    }
}
