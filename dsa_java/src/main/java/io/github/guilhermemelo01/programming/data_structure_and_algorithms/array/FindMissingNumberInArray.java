package io.github.guilhermemelo01.programming.data_structure_and_algorithms.array;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,5};
        Integer missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    public static Integer findMissingNumber(Integer[] arr){
        /*
        * MATHEMATICAL APPROACH TO FIND MISSING NUMBER
        *
        * - The sum of first 'n' natural numbers = 1+2+3+4...+n = n x (n+1) / 2
        * arr = [1,2,3,5] ->
        *    4 * (4+1) /2
        *    4 * 5 / 2
        *    20 / 2
        *    10
        *    9
        *    7
        *    4
        *
        *
        * And after that, just to decrease the sum value to find the missing number.
        *
        * */

        int nValues = arr.length+1; //Sometimes the 'n' is equal to arr.length only. I don't know WHY!
        int sum = nValues * (nValues+1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }

        return sum;
    }


}
