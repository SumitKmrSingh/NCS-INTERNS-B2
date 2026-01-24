package twoDArray;

import java.util.Scanner;

public class MatrixSum {
    // add matrix elements
    public static void addMatrix(int [][]matrix1, int row1, int col1, int [][]matrix2, int row2, int col2){
        if(row1==row2 && col1==col2){
            int [][]result = new int[row1][col2];
            for (int i=0; i<row1; i++){
                for (int j=0; j<col1; j++){
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            printMatrix(result, row1, col1);
        }
        else {
            System.out.println("Matrix sum is not possible because order of both matrix is different");
        }

    }

    // print matrix elements
    public static void printMatrix(int [][]matrix, int row, int col){
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // matrix 1 details
        System.out.print("Enter total no of row for matrix 1 : ");
        int row1 = sc.nextInt();
        System.out.print("Enter total no of column for matrix 1 : ");
        int col1 = sc.nextInt();
        int [][]matrix1 = new int[row1][col1];
        System.out.println("Enter all the elements of for matrix 1 : ");
        for(int i=0; i<row1; i++){
            for (int j=0; j<col1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        // matrix 2 details
        System.out.print("Enter total no of row for matrix 2 : ");
        int row2 = sc.nextInt();
        System.out.print("Enter total no of column for matrix 2 : ");
        int col2 = sc.nextInt();
        int [][]matrix2 = new int[row2][col2];
        System.out.println("Enter all the elements of for matrix 2 : ");
        for(int i=0; i<row2; i++){
            for (int j=0; j<col2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        // print matrix 1
        System.out.println("Matrix 1 : ");
        printMatrix(matrix1, row1, col1);

        // print matrix 2
        System.out.println("Matrix 2");
        printMatrix(matrix2, row2, col2);

        // add matrix
        System.out.println("Sum of matrix elements are : ");
        addMatrix(matrix1, row1, col1, matrix2, row2, col2);
    }
}
