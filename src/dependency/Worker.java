package dependency;

public class Worker {
    public void printBook(){
        Printer printer = new Printer();
        printer.printing("Java Book");
    }
}
