package typeCasting.prac;

public class Client {
    public static void main(String[] args) {
        Animals animals = new Dog();  // Upcasting
//        animals.sound();
//        animals.eat();

        Dog d1 = (Dog)animals;  // DownCasting
        d1.sound();
        d1.eat();
        d1.run();
        Dog dog = new Dog();

    }
}
