package io.github.guilhermemelo01.problem_solving.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLaterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberOfLanterns = in.nextInt();
        int streetLength = in.nextInt();

        int[] street = new int[numberOfLanterns];
        int d = 0;
        while (d < numberOfLanterns) {
            int value = in.nextInt();
            street[d] = value;
            d++;
        }

        street = Arrays.stream(street).sorted().toArray();
        double answer = Math.max(street[0], (streetLength - street[street.length-1]));

        for(int i = 0; i < street.length-1; i++){
            answer = Math.max(answer, ((street[i+1] - street[i])/2.0));
        }

        System.out.println(answer);
        in.close();
    }
}
