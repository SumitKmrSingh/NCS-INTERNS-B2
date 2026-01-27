package association;

public class Student {
    private String name;
    private int rollNo;
    private Address address;

    public Student() {
    }

    public Student(String name, int rollNo, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayStudentDetails(){
        System.out.println("Student name : "+this.name);
        System.out.println("Student rollNo : "+this.rollNo);
        System.out.println("Student address : "+this.address.getCity()+" "+this
                .address.getState());
    }
}
