package doubtSession;

class A{
    public A(){
        System.out.println("A");
    }
}

public class B extends A{
    public B(String s){
        System.out.println("B");
    }
    public static void main(String[] args) {
        new B("C");
        System.out.println(" ");
    }
}
