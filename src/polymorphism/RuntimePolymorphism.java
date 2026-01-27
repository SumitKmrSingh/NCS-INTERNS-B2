package polymorphism;

class Shape{
    void area(){
        System.out.println("Shape Area");
    }
}

class Square extends Shape{
    @Override
    void area() {
        System.out.println("Area of Square = sideXside");
    }
}

class Rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Area of rectangle = LXB");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
    }
}
