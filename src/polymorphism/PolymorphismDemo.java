package polymorphism;

class Demo{
    public int add(String num2, int num1){
        return num1;
    }
    public void add(int num1, String num2){

    }
}

class A{
    void display(){
        System.out.println("Inside A class method");
    }
}

class B extends A{
    void display(int x){
        System.out.println("Inside B class method");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        main(5);
        Demo obj = new Demo();

        obj.add(4, "Sumit");
        obj.add(4, "Sumit");

        B obj1 = new B();
    }

    public static void main(int x){
        System.out.println("Inside User defined main method");
    }
}
