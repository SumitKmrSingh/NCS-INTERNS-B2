package recursion;

public class FibonacciSeries {
    public static int getFib(int num){
        // Base case
        if(num==0 || num==1){
            return num;
        }
        int prev = getFib(num-1);
        int prevKaPrev = getFib(num-2);
        return prev+prevKaPrev;
    }
    public static void main(String[] args) {
        int num=9;
        int result = getFib(num);
        System.out.println(result);
    }
}
