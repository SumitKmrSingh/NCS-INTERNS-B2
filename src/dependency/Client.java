package dependency;

public class Client {
    public static void main(String[] args) {
//        Worker worker = new Worker();
//        worker.printBook();

        Processor processor = new Processor();

        Laptop myLaptop = new Laptop();

        myLaptop.setProcessor(processor);
        myLaptop.startLaptop();
    }
}
