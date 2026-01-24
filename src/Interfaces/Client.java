package Interfaces;

public class Client {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.eat();
        obj.sleep();
        obj.work();

        Child child = new Child();
        child.eat();
        child.sleep();
        child.study();
    }
}
