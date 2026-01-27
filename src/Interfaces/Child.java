package Interfaces;

public class Child implements Person{

    @Override
    public void eat() {
        System.out.println("Child is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Child is sleeping at mid night");
    }

    public void study(){
        System.out.println("Child is study");
    }
}
