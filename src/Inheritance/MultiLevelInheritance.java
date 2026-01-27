package Inheritance;

class GrandParent{
    String name;

    public GrandParent() {
    }

    public GrandParent(String name) {
        this.name = name;
    }

    void eat(){
        System.out.println(name+" Is eating");
    }

    void sleep(){
        System.out.println(name+" Is sleeping");
    }
}

class Father extends GrandParent{
    private String salary;
    public Father() {
    }

    public Father(String name){
        super(name);
    }

    void work(){
        System.out.println(name+" Is working");
    }
}

class Son extends Father{

    public Son() {
    }

    public Son(String name) {
        super(name);
    }

    void study(){
        System.out.println(name+" Is studying");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        GrandParent grandParent = new GrandParent("DataJII");
        grandParent.eat();
        grandParent.sleep();

        Father father = new Father("Pita Jiii");
        father.eat();
        father.work();
        father.sleep();

        Son son = new Son("Beta JIII");
        son.eat();
        son.sleep();
        son.work();
        son.study();
    }
}
