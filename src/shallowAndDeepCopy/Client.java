package shallowAndDeepCopy;


public class Client {
    public static void main(String[] args) {
        Address address = new Address("Chennai");
        Student std = new Student("Sumit", "1", address);

        // // Shallow Copy
//        Student copyStd = new Student(std);
//        System.out.println("Student City : "+std.getAddress().getCity());     // Chennai
//        System.out.println("Copy Student City : "+copyStd.getAddress().getCity()); // Chennai
//
//        copyStd.getAddress().setCity("Pune");
//
//        System.out.println("Student City : "+std.getAddress().getCity());     // Pune
//        System.out.println("Copy Student City : "+copyStd.getAddress().getCity()); // Pune

        // deep Copy
        Student deepCopy = new Student(std);
        System.out.println("Student City : "+std.getAddress().getCity());     // Pune
        System.out.println("Copy Student City : "+deepCopy.getAddress().getCity()); // Pune

        deepCopy.getAddress().setCity("Delhi");

        System.out.println("Student City : "+std.getAddress().getCity());     // Pune
        System.out.println("Copy Student City : "+deepCopy.getAddress().getCity()); // Pune


    }
}
