package io.github.guilhermemelo01.problem_solving.beecrowd;

import java.util.Scanner;

public class bee_1088 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        while (true) {
            boolean flipper = true;
            String values = in.nextLine();
            if (values.equals("0")) {
                break;
            }

            String[] split = values.split(" ");
            int[] arr = new int[split.length];
            for (int i = 0; i < split.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                        flipper = !flipper;
                    }
                }
            }

            if (flipper) {
                sb.append("Marcelo\n");
            } else {
                sb.append("Carlos\n");
            }
        }

        System.out.println(sb);
    }
}
