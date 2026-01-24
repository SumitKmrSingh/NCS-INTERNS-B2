package exceptions.exceptionPropagation;

public class OnlinePayment {
    private void contactBank() {
        System.out.println("Connection to Bank......");
//        int x = 10/0;
        System.out.println("Bank approved payment......");
    }

    private void makePayment() {
        System.out.println("Processing Payment.......");
        contactBank();
        System.out.println("Payment Successful.....");
    }


    public void placeOrder(){
        System.out.println("Placing order........");
        makePayment();
        System.out.println("order placed Successfully......");
    }


}
