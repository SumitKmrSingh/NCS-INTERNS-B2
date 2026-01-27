package oops.classObject;

public class Student {
    private String name;
    private int age;
    int rollNo;
    protected String email;
    public String std;



    // non-parameterized constructor
    public Student() {
        System.out.println("Inside non-parameterized constructor");
    }

    // parameterized constructor
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void displayStudentDetails(){
        System.out.println(name);
    }
}
