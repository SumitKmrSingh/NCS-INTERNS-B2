package two_DArray;

import java.util.Scanner;

public class EvenNumberMatrix {
    public static void getEven(int [][]matrix, int row, int col){
        System.out.print("All even number in given matrix : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (matrix[i][j]%2 == 0){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }

        // Using for-each
//        for (int []arr : matrix){
//            for (int x : arr){
//                if (x%2 == 0){
//                    System.out.print(x+" ");
//                }
//            }
//        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of row : ");
        int row = sc.nextInt();
        System.out.print("Enter total number of column : ");
        int col = sc.nextInt();

        int [][]matrix = new int[row][col];
        System.out.print("Enter all the elements of matrix : ");
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("All the elements of matrix are : ");
        for (int []arr : matrix){
            for (int x : arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        getEven(matrix, row, col);
    }
}
