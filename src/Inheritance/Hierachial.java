package Inheritance;

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println(name+" is eating");
    }

    void sleep(){
        System.out.println(name+" is sleeping");
    }
}

class Father1 extends Person{
    public Father1() {
    }

    public Father1(String name, int age) {
        super(name, age);
    }

    void work(){
        System.out.println(name+" Is working");
    }
}

class Mother extends Person{
    public Mother() {
    }

    public Mother(String name, int age) {
        super(name, age);
    }

    void cook(){
        System.out.println(name+" Is cooking");
    }
}

class Child1 extends Person{
    public Child1() {
    }

    public Child1(String name, int age) {
        super(name, age);
    }

    void study(){
        System.out.println(name+" Is Studying");
    }
}

public class Hierachial {
    public static void main(String[] args) {
        Person person = new Person("Person", 67);
        person.eat();
        person.sleep();

        Father1 father1 = new Father1("Pita JIII", 61);
        father1.eat();
        father1.sleep();
        father1.work();

        Mother mother = new Mother("Mata JIII", 61);
        mother.eat();
        mother.sleep();
        mother.cook();

        Child1 child1 = new Child1("Beta JIII", 31);
        child1.eat();
        child1.sleep();
        child1.study();
    }
}
