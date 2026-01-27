package dependency;

public class Laptop {
    private Processor processor;

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    void startLaptop() {
        processor.startProcessor();
        System.out.println("Laptop starts.");
    }
}
