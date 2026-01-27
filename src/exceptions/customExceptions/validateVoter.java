package exceptions.customExceptions;

import java.util.Scanner;

public class validateVoter {
    public static void main(String[] args) throws InvalidVoterIdException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        try{
            if (age < 18){
                throw new InvalidVoterIdException("You are not eligible for voting");
            }
            else {
                System.out.println("Eligible for vote");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
