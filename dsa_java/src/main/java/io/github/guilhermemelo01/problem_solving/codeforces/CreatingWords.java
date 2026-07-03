package io.github.guilhermemelo01.problem_solving.codeforces;

import java.util.Scanner;

public class CreatingWords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int values = in.nextInt();
        in.nextLine();
        while(values > 0){
            String value = in.nextLine();

            String[] texts = value.split(" ");
            String responseA = texts[1].charAt(0) + texts[0].substring(1);
            String responseB = texts[0].charAt(0) + texts[1].substring(1);


            System.out.println(responseA +" "+ responseB);
            values--;
        }
    }
}
