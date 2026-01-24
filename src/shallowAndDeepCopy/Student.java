package shallowAndDeepCopy;


public class Student {
    private String name;
    private String rollno;
    private Address address;

    public Student(String rollno, String name, Address address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // // Copy constructor (used later)
//    public Student(Student std){
//        this.name = std.name;
//        this.rollno = std.rollno;
//        this.address = std.address;
//    }

    // // Deep Copy Constructor
    public Student(Student std){
        this.name = std.name;
        this.rollno = std.rollno;
        this.address = new Address(std.getAddress().getCity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
