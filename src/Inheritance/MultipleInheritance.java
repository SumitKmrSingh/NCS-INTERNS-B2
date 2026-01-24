package Inheritance;

interface A{
   void display();
}

interface B {
    void display();
}

class C implements A,B{
    @Override
    public void display(){
        System.out.println("Inside display method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();






    }
}
