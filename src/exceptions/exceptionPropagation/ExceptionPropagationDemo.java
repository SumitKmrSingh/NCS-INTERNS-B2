package exceptions.exceptionPropagation;

public class ExceptionPropagationDemo {
    public void methodC(){
        int x = 10/0;               // Arithematic exception
        System.out.println("Inside method C");
    }
    public void methodB(){
        System.out.println("Inside method B");
        methodC();
    }
    public void methodA(){
        System.out.println("Inside method A");
        try {
            methodB();
        }
        catch (ArithmeticException e){
            System.out.println("Exception handle In method A");
        }
    }
    public static void main(String[] args) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
            try {
                obj.methodA();
            }
            catch (ArithmeticException e){
                System.out.println("Error : "+e);
            }

    }
}
