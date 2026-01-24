package staticKeyword.staticDemo;

public class Client {
    public static void main(String[] args) {
        HDFC hdfc1 = new HDFC("Sumit", "123");
        HDFC hdfc2 = new HDFC("Himanshu", "143");
        HDFC hdfc3 = new HDFC("Rahul", "163");

        String bankName = HDFC.getBankName();

        System.out.println(bankName);

    }
}
