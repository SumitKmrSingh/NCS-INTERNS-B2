package patterns;

import oops.classObject.Student;

import java.util.Scanner;

public class FloysaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int row = sc.nextInt();

        int temp=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public void display(){
        Student obj = new Student();
    }
}
