package io.github.guilhermemelo01.problem_solving.codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int result = 0, count = 0, value = 5;
        while (result < x) {
            if (result + value > x) {
                value--;
            } else if (result + value < x) {
                result += value;
                count++;
            }else{
                count++;
                break;
            }
        }

        System.out.println(count);
    }
}
