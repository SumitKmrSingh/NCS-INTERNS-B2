package exceptions.exceptionPropagation;

public class PaymentDemo {
    public static void main(String[] args) {
        OnlinePayment onlinePayment = new OnlinePayment();
        try {
            onlinePayment.placeOrder();
        }
        catch (ArithmeticException e){
            System.out.println("Error : Payment not success....");
        }
        System.out.println("Thank you for visiting.....");
    }
}
