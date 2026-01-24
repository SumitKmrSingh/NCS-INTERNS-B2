package staticKeyword.staticDemo;

class Student{
    private String name;
    private int rollNo;

    // Inilizer Block
    {
        System.out.println("Inside Inilizer Block");
    }

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("Inside Parameterize Constructor");
    }

    public Student() {
        System.out.println("Inside non-Parameterize Constructor");
    }

}

public class InilizerBlock {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
