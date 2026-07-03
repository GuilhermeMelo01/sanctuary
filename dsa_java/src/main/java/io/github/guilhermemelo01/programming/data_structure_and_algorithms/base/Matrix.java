package io.github.guilhermemelo01.programming.data_structure_and_algorithms.base;

public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 51},
        };

        searchInSortedMatrix(matrix, 4, 32);
    }

    public static void searchInSortedMatrix(int[][] matrix, int n, int value){
        int i = 0;
        int j = n - 1;
        while(i < n && j >= 0){
            if(matrix[i][j] == value){
                System.out.println("Value found at - "+ i + ", " + j);
                return;
            }

            if (matrix[i][j] > value){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Value not found");
    }
}

