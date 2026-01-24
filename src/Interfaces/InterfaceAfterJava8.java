package Interfaces;

interface RBI{
    void roi();
    void showInfo();
    default void info(){
        System.out.println("Inside RBI Info");
    }
    static void rbiInfo(){
        System.out.println("RBI Info");
    }
}

class SBI implements RBI{

    @Override
    public void roi() {
        System.out.println("SBI ROI");
    }

    @Override
    public void showInfo() {
        System.out.println("SBI Show Info");
    }
    public void info(){
        System.out.println("Inside SBI Info");
    }
}

class HDFC implements RBI{

    @Override
    public void roi() {
        System.out.println("HDFC ROI");
    }

    @Override
    public void showInfo() {
        System.out.println("HDFC ShowInfo");
    }

    public void info(){
        System.out.println("Inside HDFC Info");
    }

}
public class InterfaceAfterJava8 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.roi();
        sbi.showInfo();
        sbi.info();

        System.out.println("===========================================");

        HDFC hdfc = new HDFC();
        hdfc.roi();
        hdfc.showInfo();
        hdfc.info();
        System.out.println("===========================================");
        RBI.rbiInfo();
    }
}
