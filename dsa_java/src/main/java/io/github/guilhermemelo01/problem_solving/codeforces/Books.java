package io.github.guilhermemelo01.problem_solving.codeforces;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {

        // n = io.github.guilhermemelo01.books
        // t = time
        // a¹ = time for each book

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int t = in.nextInt();

        int i = 0;
        int[] arr = new int[n];
        while (i < n) {
            arr[i] = in.nextInt();
            i++;
        }

        int l = 0, cur = 0, best = 0;
        for(int r = 0; r < arr.length; r++){
            cur += arr[r];
            if(cur > t){
                cur -= arr[l];
                l++;
            }

            best = Math.max(best, (r - l) + 1);
        }

        System.out.println(best);
    }
}
