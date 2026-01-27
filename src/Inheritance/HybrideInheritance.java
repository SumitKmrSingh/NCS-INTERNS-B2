package Inheritance;

class Person1{
    void eat(){
        System.out.println("Person is eating");
    }
    void sleep(){
        System.out.println("Person is sleeping");
    }
}

class Father2 extends Person1{
    void work(){
        System.out.println("Father is working");
    }
}

interface Mother2{
    void care();
}

class Child3 extends Father2 implements Mother2{
    void study(){
        System.out.println("Child is study");
    }
    public void care(){
        System.out.println("Child is care by mother");
    }
}

public class HybrideInheritance {
    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.eat();
        obj.sleep();

        obj.work();
        obj.care();
        obj.study();
    }
}
