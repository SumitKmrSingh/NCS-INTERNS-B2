package recursion;

public class FactRevEngineering {
    public static int factorial(int n){
        // Base case
        if(n==0 || n==1){
            return 1;
        }
        // Recursive Relation
        return n*factorial(--n);
    }
    public static void main(String[] args) {
        int fact = factorial(5);
        System.out.println(fact);
    }
}
