package io.github.guilhermemelo01.problem_solving.leetcode.recursion;

public class Main{

    public static void main(String[] args) {
        boolean powerOfTwo = isPowerOfTwo(2147483647);
        System.out.println(powerOfTwo);
    }

    public static boolean isPowerOfTwo(int n) {
        return isPower(n, 0);
    }

    public static boolean isPower(int n, int base){
        int value = (int) Math.pow(2, base);

        if(value > n){
            return false;
        }

        if(value == n){
            return true;
        }

        return isPower(n, ++base);
    } 
}