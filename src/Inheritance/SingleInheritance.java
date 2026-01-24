package Inheritance;

class Parent{
    String hand;
    String money="1000000000";
    private String salary;
    String gender;
    int age;

    Parent(int x){
        System.out.println("Value of : "+x);
    }

    Parent(){
        System.out.println("Inside Parent Constructor");
    }

    public void display(){
        System.out.println("Inside Parent display method");
    }
}

class Child extends Parent{
    String fatherName;
    String motherName;
    int age;

    Child(){
        super(10);
        System.out.println("Inside Child Constructor");
        System.out.println("Father Money : "+super.money);
        super.display();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
       // Parent parent = new Parent();

        Child child = new Child();

        Parent obj = new Child();

    }
}
