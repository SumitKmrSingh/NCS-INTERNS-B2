package array.arrayObjectsexample;

public class Client {
    public static void main(String[] args) {
        Student []listOfStd = new Student[3];
        Student std1 = new Student("Sumit", 1);
        Student std2 = new Student("Archita", 2);
        Student std3 = new Student("Himanshu", 3);

        listOfStd[0]=std1;
        listOfStd[1]=std2;
        listOfStd[2]=std3;

        for (Student std : listOfStd){
            System.out.println("name : "+std.name);
            System.out.println("Rollno : "+std.rollNo);
            System.out.println("###############################");
        }

    }
}
