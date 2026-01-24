package recursion;

import java.util.Scanner;

public class CalFactorial {
    public static int calFact(int num){
        // Base Case
        if (num == 0){
            return 1;
        }
//        int smallProblem = calFact(num-1);
//        int biggerProblem = num*smallProblem;
//        return biggerProblem;

        return num * calFact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int result = calFact(num);
        System.out.println(result);

    }
}
