package abstraction;

abstract class Shape{
    int x;
    Shape(int x){
        this.x = x;
    }
    abstract void area();
    void display(){
        System.out.println("Value of X : "+x);
    }
}

class Rectangle extends Shape{
    Rectangle(int x){
        super(x);
    }

    @Override
    void area() {
        System.out.println("Rectangle area");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10);
//        rectangle.area();
//        rectangle.display();
    }
}
