import java.util.*;
import java.io.*;

class Adding_of_2_matrix {
    public static void print_sum(int matrix[][]){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] add_sum(int matrix[][], int matrix1[][], int rows, int coloum){
        // creating the new 2-D array
        int new_arr[][]= new int[rows][coloum];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<coloum; j++){
                new_arr[i][j]= matrix[i][j]+matrix1[i][j];
            }
        }
        return new_arr;
    }
	public static void main (String[] args) {
	    int rows = 3; int coloum = 3;
	    
	    int matrix[][] = {
                       {1,2,3},
                       {4,5,6},
                       {7,8,9},
                    };
     
     int matrix1[][] = {
                       {1,2,3},
                       {4,5,2}, // 4,5,6 != 4,5,2
                       {7,8,9},
                     };
    // passing the values by creating the matrix
    int sum_matrix[][] = add_sum(matrix, matrix1, rows, coloum);
    
    // calling the function to print the array;
    
    print_sum(sum_matrix);
	}
}
