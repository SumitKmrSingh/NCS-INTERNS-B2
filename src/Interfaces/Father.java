package Interfaces;

public class Father implements Person{

    @Override
    public void eat() {
        System.out.println("Father is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Father is sleeping at 9PM");
    }

    public void work(){
        System.out.println("Father is working");
    }
}
