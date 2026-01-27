package Interface_2;

import java.util.Map;

public class Child implements Father, Mother {
    void study(){
        System.out.println("Child is study");
    }

    @Override
    public void work() {
        System.out.println("Child is working");
    }

    @Override
    public void eat() {
        System.out.println("Child is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Child is sleeping");
    }

    @Override
    public void care() {
        System.out.println("Child is caring");
    }
}
