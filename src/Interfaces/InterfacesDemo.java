package Interfaces;

interface Test{
    public static final int x=10;
    int y=20;
}

class Demo{
    int x=10;
    final int xy=10;
    static int y=20;
    static int z=30;
}

public class InterfacesDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.x);
        System.out.println(Demo.y);

        System.out.println(Test.x);
        System.out.println(Test.y);
    }
}
