package oops.classObject;

public class Client {
    public static void main(String[] args) {
//        Human archita = new Human();
//
//        System.out.println(archita);    //
//
////        archita.gender="female";
////        System.out.println(archita.gender);
////
////        archita.hand="Right";
////        System.out.println(archita.hand);
////
////        archita.mouth="Archita Mouth";
////        System.out.println(archita.mouth);
////
//        Human himanshu = new Human();
////        himanshu.gender="Male";
////        himanshu.hand="Himanshu hand";
////        himanshu.mouth="Himanshu mouth";
////
////        System.out.println(himanshu.gender);  // Male
////        System.out.println(himanshu.hand);// Himanshu hand
////        himanshu.mouth="mouth";
////        System.out.println(himanshu.mouth);   // Himanshu mouth


        Human himanshu = new Human();
        System.out.println("Human Gender : "+himanshu.gender);
        System.out.println("Human Mounth : "+himanshu.mouth);
        System.out.println("Human Hand : "+himanshu.hand);

        Student obj1 = new Student("Sumit", 23);
       // System.out.println(obj1.name+" \n"+obj1.age);

        Student obj2 = new Student("Rahul", 24);
       // System.out.println(obj2.name+" "+obj2.age);

        obj1.displayStudentDetails();
        obj2.displayStudentDetails();

        Student obj3 = new Student();

    }
}
