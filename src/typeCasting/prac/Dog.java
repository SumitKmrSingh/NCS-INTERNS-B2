package typeCasting.prac;

public class Dog extends Animals{
    @Override
    public void sound(){
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    public void run(){
        System.out.println("Dog is running fast");
    }
}
