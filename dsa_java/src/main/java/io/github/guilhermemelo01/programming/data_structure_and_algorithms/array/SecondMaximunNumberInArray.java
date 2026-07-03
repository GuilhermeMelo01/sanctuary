package io.github.guilhermemelo01.programming.data_structure_and_algorithms.array;

public class SecondMaximunNumberInArray {
    public static void main(String[] args) {

        Integer[] arr = {12, 34, 2, 34, 33, 1};
        Integer second = findSecondMaximumNumberInArray(arr);
        System.out.println(second);
    }

    private static Integer findSecondMaximumNumberInArray(Integer[] arr) {
        Integer secondMaximum = Integer.MIN_VALUE;
        Integer maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) { // 0(n)
            if (arr[i] >= maximum) {
                maximum = arr[i];
            } else if (arr[i] < maximum && arr[i] >= secondMaximum) {
                secondMaximum = arr[i];
            }
        }
        return secondMaximum;
    }
}
